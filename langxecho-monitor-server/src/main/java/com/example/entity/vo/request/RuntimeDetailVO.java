package com.example.entity.vo.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/7/26 9:57
 */

@Data
public class RuntimeDetailVO {
    @NotNull
    long timestamp;
    @NotNull
    double cpuUsage;
    @NotNull
    double memoryUsage;
    @NotNull
    double diskUsage;
    @NotNull
    double networkUpload;
    @NotNull
    double networkDownload;
    @NotNull
    double diskRead;
    @NotNull
    double diskWrite;
}
