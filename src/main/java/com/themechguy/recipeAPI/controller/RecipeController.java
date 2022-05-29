package com.themechguy.recipeAPI.controller;

import com.themechguy.recipeAPI.model.Recipe;
import com.themechguy.recipeAPI.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService){
        this.recipeService=recipeService;
    }

    @GetMapping("/allRecipes")
    public ResponseEntity<List<Recipe>>getAllRecipe(){
        List<Recipe> recipes = recipeService.getALlRecipe();
        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }
   /* @PostMapping("/update")
    public ResponseEntity<List<Recipe>>addRecipe(@RequestBody Recipe recipe){
        Recipe newRecipe = recipeService.addRecipe(recipe);
        return new ResponseEntity<>(newRecipe, HttpStatus.CREATED);
    }*/

}
