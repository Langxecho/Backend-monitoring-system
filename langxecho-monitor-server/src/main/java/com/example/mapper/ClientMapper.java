package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.dto.Client;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/7/15 15:10
 */
@Mapper
public interface ClientMapper extends BaseMapper<Client> {
}
