package com.exampractice.repositories;

import com.exampractice.models.FoodType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodTypeRepository extends CrudRepository<FoodType, Long> {
}
