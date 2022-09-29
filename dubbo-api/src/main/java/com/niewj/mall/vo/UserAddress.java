package com.niewj.mall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author nieweijun
 * @description
 * @copyright © 2022 niewj.com
 * @department 研发
 * @date 2022/9/29 12:04
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress implements Serializable {
    private String id;
    private String address;
}
