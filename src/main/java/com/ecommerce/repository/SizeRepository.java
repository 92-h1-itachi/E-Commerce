package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.SizeEntity;

@Repository
public interface SizeRepository extends CrudRepository<SizeEntity, Integer>{

}
