package com.themechguy.recipeAPI.service;

import com.themechguy.recipeAPI.model.Recipe;
import com.themechguy.recipeAPI.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class RecipeService {

    private final RecipeRepository recipeRepository;


    @Autowired
    public RecipeService(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    public Recipe addRecipe(Recipe recipe){
        recipe.setId(Long.parseLong(UUID.randomUUID().toString()));
        return recipeRepository.save(recipe);
    }
    public List<Recipe> getALlRecipe(){
        return recipeRepository.findAll();
    }
}
