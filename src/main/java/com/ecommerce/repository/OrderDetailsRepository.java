package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.OrderDetailsEntity;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetailsEntity, Integer>{
	
		@Query(value = "SELECT * FROM ecomdb.orders o join ecomdb.orderdetails f on o.ordersId=f.ordersId where o.ordersId=?1",nativeQuery = true)
		List<OrderDetailsEntity> getOrderDetails(int id);
}