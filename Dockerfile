# 该镜像需要依赖的基础镜像
FROM openjdk:8-jdk-alpine
# 将targer目录下的jar包复制到docker容器/home/springboot目录下面目录下面
ADD ./target/springBoot1-0.0.1-SNAPSHOT.jar /usr/local/springboot/springboot-test.jar
# 声明服务运行在8080端口
EXPOSE 8001
# 执行命令
CMD ["java","-jar","/usr/local/springboot/springboot-test.jar","&"]
# 指定维护者名称
MAINTAINER itcolors itcolors@qq.com
