package my.test.web.controller;

import my.test.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;
//    private final DemoService demoService;
//
//    @Autowired
//    DemoController(DemoService demoService){
//        this.demoService = demoService;
//    }

    @RequestMapping("/test")
    public Object Test(){
        return demoService.getContent();
    }

}
