package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.ColorEntity;

@Repository
public interface ColorRepository extends CrudRepository<ColorEntity, Integer>{

}
