package site.xingchi.springboot1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.xingchi.springboot1.utils.AjaxResult;

@RestController
@RequestMapping("/test")
@RefreshScope
@Slf4j
public class TestController {

    @Value("${test.name}")
    private String name;
    @PostMapping("/tt")
    public AjaxResult test(){
        log.info("name=={}",name);
        return AjaxResult.success("成功","hide");
    }

    @GetMapping("/getName")
    public AjaxResult getName(){
        log.info("name=={}",name);
        return AjaxResult.success("获取成功","name:===xingchi"+name);
    }
}
