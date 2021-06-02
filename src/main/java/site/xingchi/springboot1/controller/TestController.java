package site.xingchi.springboot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.xingchi.springboot1.utils.AjaxResult;

@RestController
@RequestMapping("/test")
public class TestController {
    @PostMapping("/tt")
    public AjaxResult test(){
        return AjaxResult.success("成功","hide");
    }

    @GetMapping("/getName")
    public AjaxResult getName(){
        return AjaxResult.success("获取成功","name:===xingchi");
    }
}
