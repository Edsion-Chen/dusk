package com.blog.dusk.Repository;

import com.blog.dusk.entity.goods;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface GoodsRepository extends Serializable,JpaRepository<goods,Integer>,JpaSpecificationExecutor<goods> {
}
