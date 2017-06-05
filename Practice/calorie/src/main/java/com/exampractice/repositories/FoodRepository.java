package com.exampractice.repositories;


import com.exampractice.models.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food,Long>{
}
