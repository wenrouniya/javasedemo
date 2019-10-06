package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anno")
public class annotionController {
    @RequestMapping("/testanno/{sid}")
    public String testAnno(@PathVariable(name = "sid") String  id){
        System.out.println(id);
        return  "success";
    }
}
