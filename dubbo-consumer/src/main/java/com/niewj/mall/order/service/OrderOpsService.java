package com.niewj.mall.order.service;

import com.niewj.mall.vo.UserAddress;

import java.util.List;

/**
 * @author nieweijun
 * @description
 * @copyright © 2022 niewj.com
 * @department 研发
 * @date 2022/9/29 13:30
 * @modify by nieweijun on 2022/9/29 13:30
 */

public interface OrderOpsService {

    List<UserAddress> createOrder(String uid);

}
