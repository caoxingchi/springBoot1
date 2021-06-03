package site.xingchi.springboot1.nacosconfig;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@RefreshScope//自动刷新配置文件
public class NacosConfigConfiguration {
}
