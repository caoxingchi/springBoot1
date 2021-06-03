# 该镜像需要依赖的基础镜像
FROM openjdk:8-jdk-alpine
# 将targer目录下的jar包复制到docker容器/home/springboot目录下面目录下面
COPY ./target/springBoot1-0.0.1-SNAPSHOT.jar /usr/local/myproject/springboot/springboot-test.jar

# 执行命令
CMD ["java","-jar","/usr/local/myproject/springboot/springboot-test.jar","&"]
# 指定维护者名称
MAINTAINER itcolors itcolors@qq.com
