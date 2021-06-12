package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.OrdersEntity;

@Repository
public interface OrdersRepository extends CrudRepository<OrdersEntity, Integer>{

}