package com.themechguy.recipeAPI.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("recipe")
public class Recipe {
    private String ingridents;
    private String cookingSteps;
    private String recipeName;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    private String imageUrl;

    public String getIngridents() {
        return ingridents;
    }

    public void setIngridents(String ingridents) {
        this.ingridents = ingridents;
    }

    public String getCookingSteps() {
        return cookingSteps;
    }

    public void setCookingSteps(String cookingSteps) {
        this.cookingSteps = cookingSteps;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
 /*   public Recipe(String ingridents, String cookingSteps, String imageUrl){
        super();
        this.ingridents=ingridents;
        this.cookingSteps=cookingSteps;
        this.imageUrl=imageUrl;
    }*/
}
