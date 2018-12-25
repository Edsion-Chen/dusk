package com.blog.dusk.Repository;

import com.blog.dusk.entity.transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface TransactionRepository extends Serializable,JpaRepository<transaction,Integer>,JpaSpecificationExecutor<transaction> {
}
