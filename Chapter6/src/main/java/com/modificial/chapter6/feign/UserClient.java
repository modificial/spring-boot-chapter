package com.modificial.chapter6.feign;

import com.modificial.chapter6.entity.UserEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author modificial
 * @date 2018/5/20
 * @company codingApi
 * @description
 */
@FeignClient(value = "chapter5")
public interface UserClient {
    @GetMapping("/user/list")
     List<UserEntity> list();
}
