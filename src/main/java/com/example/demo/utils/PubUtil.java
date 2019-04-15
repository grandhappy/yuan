package com.example.demo.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Pattern;

public class PubUtil {

    public static String getPathFromURL(HttpServletRequest req, String pattern) throws UnsupportedEncodingException {
        String path = req.getRequestURI().replaceAll("^.*" + Pattern.quote(pattern), "");
        path = path.replaceAll(Pattern.quote("%"), "%25");
        path = path.replaceAll(Pattern.quote("+"), "%2B");
        path = path.replaceAll(Pattern.quote("#"), "%23");
        path = URLDecoder.decode(path, "UTF-8");
        if(path.isEmpty()) {
            return "/";
        }
        return path;
    }
}
