package com.pets.controller;
import com.pets.interfence.IMyInterfence;
import org.jboss.netty.handler.codec.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.annotation.Resource;

/**
 * Created by liyut on 2017-12-13.
 */
@Controller
public class MyController {
    @Resource
    private IMyInterfence myInterfence;
    @RequestMapping("/test.do")
    @ResponseBody
    public String getTest() {
        System.out.print("11111111111");
        String str = myInterfence.helloWolrd();
        System.out.print(str);
//        return  ReturnView.newInstance().code(0).msg("第一次握手").json();
        return  "woshou";

    }


    @RequestMapping("/login.do")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        System.out.print("22222");
        String id = request.getParameter("id");

        String str = myInterfence.login(Integer.valueOf(id));
        System.out.print(str);
        return "welcome";
    }
}
