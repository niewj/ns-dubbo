package com.niewj.mall.provider;

import com.niewj.mall.api.UserServiceApi;
import com.niewj.mall.vo.UserAddress;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author nieweijun
 * @description
 * @copyright © 2022 niewj.com
 * @department 研发
 * @date 2022/9/29 12:16
 */
@DubboService(registry="zk-registry")
@Service
public class UserAddressImpl implements UserServiceApi {

    /**
     * @param uid 用户id
     * @return
     */
    @Override
    public List<UserAddress> listAllUserAddresses(String uid) {
        UserAddress addr1 = new UserAddress("1", "北京市大兴区亦庄开发区亦城中心");
        UserAddress addr2 = new UserAddress("2", "西安市雁塔区曲江创意谷");
        List<UserAddress> userAddresses = Arrays.asList(addr1, addr2);
        return userAddresses;
    }
}
