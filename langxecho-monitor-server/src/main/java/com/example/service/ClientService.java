package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.dto.Client;
import com.example.entity.vo.request.ClientDetailVO;
import com.example.entity.vo.request.RuntimeDetailVO;
import com.example.mapper.ClientMapper;

public interface ClientService extends IService<Client> {
    String registerToken();
    boolean verifyAndRegister(String token);

    Client findClientById(int id);
    Client findClientByToken(String token);
    void updateClientDetail(ClientDetailVO vo,Client client);

    void updateRuntimeDetail(RuntimeDetailVO vo,Client client);
}
