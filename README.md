# SPtest3

#### 项目介绍
SpringBoot+Mybatis+Thymeleaf 实现了一个简单的demo
注意Spring常用注解的用法，我就犯了好多错
@Service用于标注业务层组件、 
@Controller用于标注控制层组件（如struts中的action）
@Repository用于标注数据访问组件，即DAO组件。
@Component泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
@Autowired 默认按类型装配，如果我们想使用按名称装配，可以结合@Qualifier注解一起使用。如下：
@Autowired @Qualifier("personDaoBean") 存在多个实例配合使用
@Resource默认按名称装配，当找不到与名称匹配的bean才会按类型装配。

#### 软件架构
软件架构说明


#### 安装教程

1. xxxx
2. xxxx
3. xxxx

#### 使用说明

1. xxxx
2. xxxx
3. xxxx

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request


#### springboot
1. 静态资源文件
    https://blog.52itstyle.vip/archives/2552/