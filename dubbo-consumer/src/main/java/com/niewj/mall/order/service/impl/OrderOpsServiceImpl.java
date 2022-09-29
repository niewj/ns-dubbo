package com.niewj.mall.order.service.impl;

import com.niewj.mall.api.UserServiceApi;
import com.niewj.mall.order.service.OrderOpsService;
import com.niewj.mall.vo.UserAddress;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author nieweijun
 * @description
 * @copyright © 2022 niewj.com
 * @department 研发
 * @date 2022/9/29 13:31
 */
@Slf4j
@DubboService(registry="zk-registry")
@Service
public class OrderOpsServiceImpl implements OrderOpsService {

    @DubboReference
    private UserServiceApi userServiceApi;

    @Override
    public List<UserAddress> createOrder(String uid) {
        log.info("createOrder=> udi={}", uid);
        return userServiceApi.listAllUserAddresses(uid);
    }
}
