package com.niewj.mall.api;

import com.niewj.mall.vo.UserAddress;

import java.util.List;

/**
 * @author nieweijun
 * @description
 * @copyright © 2022 niewj.com
 * @department 研发
 * @date 2022/9/29 12:03
 * @modify by nieweijun on 2022/9/29 12:03
 */
public interface UserServiceApi {

    /**
     * 根据用户id返回用户地址列表
     *
     * @param uid 用户id
     * @return
     */
    List<UserAddress> listAllUserAddresses(String uid);

}
