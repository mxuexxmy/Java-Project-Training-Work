# java-project-training-work

小马哥的 Java 项目实战营作业集提交仓库

## 作业一
> 作业地址：week-1/my-user-platform
>
>  最新作业地址：stage-0/my-user-platform     
>
>  分支：week-1
>
>   作业链接：https://github.com/mxuexxmy/java-project-training-work/tree/week-1

要求：

- 通过自研 Web MVC 框架实现（可以自己实现）一个用户注册，forward 到一个成功的页面（JSP 用法）/register
- 通过 Controller -> Service -> Repository 实现（数据库实现）
- （非必须）JNDI 的方式获取数据库源（DataSource），在获取 Connection

## 作业二

> 作业地址：stage-0/my-user-platform
>
> * 参考 小马哥的 仓库，及 stage 为阶段，所以 week-1 更改为 stage-0。
> * 采用分支作为作业标识。
> * week-2
>
>   作业链接：https://github.com/mxuexxmy/java-project-training-work/tree/week-2

要求：

* 通过课堂上的简易版依赖注入和依赖查找，实现用户注册功能
* 通过 UserService 实现用户注册，注册用户需要检验
* Id：必须大于 0 的整数
* 密码：6-32 位
* 电话号码:采用中国大陆的方式（11位检验）

## 作业三

需求一（必须）

* 整合 https://jolokia.org
* 实现一个自定义 JMX MBean，通过 Jolokia 做 Servlet 代理

需求二（选做）

* 继续完成 Microprofile config API 中的实现
  * 扩展 `org.eclipse.microprofile.config.spi.ConfigSource` 实现，包括 OS 环境变量，以及本地配置文件
  *  扩展 `org.eclipse.microptofile.config.spi.Converter` 实现提供 `String` 类型的到简单类型
*  通过 `org.eclipse.microprofile,config.Config` 读取当前应用配置名称
  * 应用名称 `property name = "application.name"`

## 遇到问题及解决方案

### git 遇到同步问题

出现提示：`OpenSSL SSL_read: Connection was reset, errno 10054` and `Failed to connect to github.com port 443: Timed out`

解决方法：在仓库的git下输入`git config --global http.sslVerify "false"`

### 项目打包及运行

* 打包 
  * 在项目的文件夹下
  * 输入命令：`mvn clean package -U`
  * 输入运行 jar 命令：`java -jar ***.jar`

### 项目依赖包没有依赖，没有报错

结果对比排除，找到的原因是，父级项目（root）少了依赖包:

```
<dependency>
    <groupId>commons-validator</groupId>
    <artifactId>commons-validator</artifactId>
    <version>${commons-validator.version}</version>
</dependency>
```

### 解决`maven-source-plugin:3.2.1 not found`

由 mybatis 插件引起的

解决方案： 

在出现问题的地方，点击小红点：

* 选择`inspection‘Mapper xml inspection’ option` 选项。
* 选择`Edit inspection profile setting`
* 去掉Mybatis 插件报红的选项，如
  * `Mapper method inspection`
  * `Mapper xml inspection`