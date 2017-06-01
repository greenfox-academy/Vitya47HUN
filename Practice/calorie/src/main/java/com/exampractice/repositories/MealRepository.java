package com.exampractice.repositories;


import com.exampractice.models.Meal;
import org.springframework.data.repository.CrudRepository;

public interface MealRepository extends CrudRepository<Meal,Long>{
}
