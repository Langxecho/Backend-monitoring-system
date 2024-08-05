package com.example.controller;

import com.example.entity.RestBean;
import com.example.entity.dto.Client;
import com.example.entity.dto.ClientDetail;
import com.example.entity.vo.request.ClientDetailVO;
import com.example.entity.vo.request.RuntimeDetailVO;
import com.example.service.ClientService;
import com.example.utils.Const;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/detail")
    public RestBean<Void> updateClientDerails(@RequestAttribute(Const.ATTR_CLIENT) Client client,
                                              @RequestBody @Valid ClientDetailVO vo){
        service.updateClientDetail(vo,client);
        return RestBean.success();
    }
    @PostMapping("/runtime")
    public RestBean<Void> updateRuntimeDetails(@RequestAttribute(Const.ATTR_CLIENT) Client client,
                                               @RequestBody @Valid RuntimeDetailVO vo){
        service.updateRuntimeDetail(vo,client);
        return RestBean.success();
    }
}
