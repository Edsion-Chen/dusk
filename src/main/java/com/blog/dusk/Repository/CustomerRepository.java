package com.blog.dusk.Repository;

import com.blog.dusk.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface CustomerRepository extends Serializable,JpaRepository<customer,Integer> ,JpaSpecificationExecutor<customer> {
}
