package com.modificial.chapter6.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author modificial
 * @date 2018/5/19
 * @company codingApi
 * @description
 */
@Data
@ApiModel
@ToString
public class User {
@ApiModelProperty(value = "id")
    private int id;
@ApiModelProperty(value = "用户名")
    private String username;
@ApiModelProperty(value = "年龄")
    private int age;
@ApiModelProperty(value = "日期")
    private Date ctm;

    // Getter Setter
}
