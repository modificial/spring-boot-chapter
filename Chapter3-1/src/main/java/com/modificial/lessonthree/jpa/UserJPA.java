package com.modificial.lessonthree.jpa;

import com.modificial.lessonthree.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author modificial
 * @date 2018/4/8
 * @company codingApi
 * @description jpa操作数据库
 */
public interface UserJPA extends
        JpaRepository<UserEntity, Long>,
        JpaSpecificationExecutor<UserEntity>,
        Serializable{
}
