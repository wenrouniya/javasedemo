package cn.itcast.controller;

import cn.itcast.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/param")
public class paramController {
    @RequestMapping(path = "/testparam")
    public  String  testParam(Account account){
        System.out.println("绑定了.....");
        System.out.println(account);
        return "success";
    }


}
