package com.zb.src.FeignService;

import org.springframework.stereotype.Service;

@Service
public class Feignaa implements Feignser {

    @Override
    public String shopping(String userName) {
        return "接口暂时不可用";
    }

    @Override
    public String deleteUser(String id) {
        return "接口暂时不可用";
    }
}
