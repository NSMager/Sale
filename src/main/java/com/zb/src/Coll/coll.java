package com.zb.src.Coll;


import com.alibaba.fastjson.JSON;
import com.zb.src.FeignService.Feignser;
import com.zb.src.Servlet.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class coll {


    @Autowired
    Service service;

    @Autowired
    Feignser feignser;

    @RequestMapping("/shopping")
    public String shopping(){
        return "list";
    }

    @RequestMapping("/showUser")
    @ResponseBody
    public String showUSer(String userName){
       return feignser.shopping(userName);
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(String id){
        return feignser.deleteUser(id);
    }
}
