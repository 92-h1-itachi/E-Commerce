package com.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.ImagesEntity;

@Repository
public interface ImagesRepository extends CrudRepository<ImagesEntity, Integer>{

}
