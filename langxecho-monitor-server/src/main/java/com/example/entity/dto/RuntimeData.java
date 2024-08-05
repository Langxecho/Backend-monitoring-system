package com.example.entity.dto;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;
import lombok.Data;

import java.time.Instant;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/8/5 10:12
 */
@Data
@Measurement(name = "runtime")
public class RuntimeData {
    @Column(tag = true)
    int clientId;
    @Column(timestamp = true)
    Instant timestamp;
    @Column
    double cpuUsage;
    @Column
    double memoryUsage;
    @Column
    double diskUsage;
    @Column
    double networkUpload;
    @Column
    double networkDownload;
    @Column
    double diskRead;
    @Column
    double diskWrite;
}
