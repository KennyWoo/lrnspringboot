处理Web请求: SpringMVC

定义Web视图: Thymeleaf

持久化数据: Spring Data JPA

### 目录结构

LrnSpringBootApplication.java -- 应用程序启动类

application.properties -- 配置文件

LrnSpringBootApplicationTest.java -- 应用程序测试类

### 注解

`@SpringBootApplication`

  L `@Configuration` : 标明该类使用 Spring 基于 Java 的配置
  
  L `@ComponentScan` : 启用组件扫描
  
  L `@EnableAutoConfiguration` : 开启自动配置
  
### 使用

1. 第一种方式：继承 `spring-boot-starter-parent`，并在 <parent> 中指定版本即可。
2. 第二种方式：导入依赖 `spring-boot-dependencies`

Spring Bean 四种依赖: `@Component`, `@Service`, `@Repository`, `@Controller`

### 热部署

三种解决方案

* JRebel
* Spring Loaded
* spring-boot-devtools

> devtools 重启 idea : Build -> Command + F9 (Build Project)

> 外置文件触发重启
> spring.devtools.restart.trigger-file

