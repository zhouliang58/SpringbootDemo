package com.imooc.swaggerController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by zhouliang
 * 2017-09-26 21:44
 */
@RestController
public class TestController {

    @ApiIgnore
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }

}
