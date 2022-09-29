package com.niewj.mall.order.controller;

import com.niewj.mall.order.service.OrderOpsService;
import com.niewj.mall.vo.UserAddress;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author nieweijun
 * @description
 * @copyright © 2022 niewj.com
 * @department 研发
 * @date 2022/9/29 13:40
 */
@Slf4j
@Controller
public class OrderOpsController {

    @Resource
    private OrderOpsService orderOpsService;

    @ResponseBody
    @GetMapping("/createOrder/{uid}")
    public List<UserAddress> createOrder(@PathVariable("uid") String uid) {

        log.info("uid={}", uid);
        return orderOpsService.createOrder(uid);
    }
}
