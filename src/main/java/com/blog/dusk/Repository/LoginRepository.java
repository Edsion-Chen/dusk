package com.blog.dusk.Repository;

import com.blog.dusk.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * 用户 Repository
 *
 * @author mgzu
 * @date 2018/5/9
 */
public interface LoginRepository extends Serializable, JpaRepository<Login, Integer>, JpaSpecificationExecutor<Login> {
}