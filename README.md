# java-project-training-work

小马哥的 Java 项目实战营作业集提交仓库

## 作业一
> 作业地址：week-1/my-user-platform

要求：

- 通过自研 Web MVC 框架实现（可以自己实现）一个用户注册，forward 到一个成功的页面（JSP 用法）/register
- 通过 Controller -> Service -> Repository 实现（数据库实现）
- （非必须）JNDI 的方式获取数据库源（DataSource），在获取 Connection

#### 遇到问题及解决方案

* git 遇到同步问题：`OpenSSL SSL_read: Connection was reset, errno 10054` and `Failed to connect to github.com port 443: Timed out`

  在仓库的git下输入`git config --global http.sslVerify "false"`

* 项目打包及运行

  * 打包 
    * 在项目的文件夹下
    * 输入命令：`mvn clean package -U`
    * 输入运行 jar 命令：`java -jar ***.jar`

