package com.spy.databrowser.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@Data
@AllArgsConstructor
public class Company {
    private String csfId;
    private String name;
    private String secu;
    private String tick;
    private Integer listStatus;
}
