package com.example.demo.controller;

import com.example.demo.utils.PubUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

@RequestMapping(value="/pdf")
@Controller
public class PdfController {
    @Value("${pdf.path}")
    String path;
    @Value("${project.index.url}")
    String url;
    @Value("${server.port}")
    String port;

    @RequestMapping("preview")

    /**
    * @Description:获取PDF预览
    * @Param: index:pdf编号
    * @return: java.lang.String
    * @Author: zule
    */
    public String displayPdf(
            @RequestParam(value = "index", required = true) String index,
            Model model) {
        String previewUrl = url+":"+port+ "/pdf/download" + index;
        model.addAttribute("source_url", previewUrl);
        return "common/preview";
    }
    /**
     * @Description:PDF下载地址
     * @Param: index:pdf编号
     * @return: java.lang.String
     * @Author: zule
     */
    @RequestMapping("download/{index}/**")
    public void downloadPdf(
            @PathVariable(value = "index") String index,
            HttpServletRequest request, HttpServletResponse response) {
        try {
            index = PubUtil.getPathFromURL(request,"download");
            File file = new File(path + index);
            FileInputStream fileInputStream = new FileInputStream(file);
            response.setHeader("Content-Disposition", "attachment;fileName=test.pdf");
            response.setContentType("multipart/form-data");
            OutputStream outputStream = response.getOutputStream();
            IOUtils.write(IOUtils.toByteArray(fileInputStream), outputStream);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
