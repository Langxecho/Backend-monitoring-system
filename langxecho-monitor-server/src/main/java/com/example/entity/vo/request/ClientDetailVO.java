package com.example.entity.vo.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/7/22 16:33
 */
@Data
public class ClientDetailVO {
    @NotNull
    String osArch;
    @NotNull
    String osName;
    @NotNull
    String osVersion;
    @NotNull
    int osBit;
    @NotNull
    String cpuName;
    @NotNull
    int cpuCore;
    @NotNull
    double memory;
    @NotNull
    double disk;
    @NotNull
    String ip;
}
