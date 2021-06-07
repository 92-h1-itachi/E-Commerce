package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.RamEntity;

@Repository
public interface RamrRepository extends CrudRepository<RamEntity, Integer>{

}
