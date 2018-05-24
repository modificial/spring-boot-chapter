package com.modificial.chapter6.feign;

import com.modificial.chapter6.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author modificial
 * @date 2018/5/20
 * @company codingApi
 * @description
 */
@Slf4j
@Component
public class UserClientFallBack implements UserClient {
    @Override
    public List<UserEntity> list() {
        log.error("调用失败");
        throw  new RuntimeException("调用失败");
    }
}
