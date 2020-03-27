package com.itcast.quick.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 */
@RestController //@controller+@ResponseBody等同于这俩个注解
public class QuickController {
        @RequestMapping("/quick")
    public void quick(){
        System.out.println("第一个spring boot 工程被访问了");
    }
}
