package com.spy.databrowser.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author lei.zhao_ext
 * @Date 2021/2/19
 */
@Data
public class Teacher {
    private String no;

    private String name;

    private String sex;

    private Date birthday;

    private String prof;

    private String depart;
}
