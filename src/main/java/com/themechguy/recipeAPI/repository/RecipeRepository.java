package com.themechguy.recipeAPI.repository;

import com.themechguy.recipeAPI.model.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends MongoRepository<Recipe, Long> {
    List<Recipe> findByName(String name);
}
