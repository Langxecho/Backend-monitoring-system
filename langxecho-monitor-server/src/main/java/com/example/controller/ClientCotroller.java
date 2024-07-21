package com.example.controller;

import com.example.entity.RestBean;
import com.example.service.ClientService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/7/15 14:57
 */
@RestController
@RequestMapping("/monitor")
public class ClientCotroller {
    @Resource
    ClientService service;
    @GetMapping("/register")
    public RestBean<Void> registerClient(@RequestHeader("Authorization") String token
                                            ){
      return   service.verifyAndRegister(token) ?
              RestBean.success() : RestBean.failure(401,"客户端注册失败，请检查token是否正确");
    }

}
