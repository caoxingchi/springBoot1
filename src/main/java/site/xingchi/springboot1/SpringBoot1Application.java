package site.xingchi.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//除去数据源自动加载的配置
public class SpringBoot1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);
    }

}
