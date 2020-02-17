package com.zb.src.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="PROVIDER",fallback = Feignaa.class)
public interface Feignser {

    @RequestMapping("/showUser")
    public String shopping(@RequestParam("userName") String userName);

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") String id);
}
