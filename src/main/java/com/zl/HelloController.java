package com.zl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhouliang on 2017-09-22.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @Value("${girl.age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(Model model) {
        return content + " " + girlProperties.getCupSize() + " " + age;
    }
}
