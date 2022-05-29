package com.themechguy.recipeAPI.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("recipe")
public class Recipe {

    private long id;
    private String ingridents;
    private String cookingSteps;
    private String recipeName;
    private String imageUrl;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }



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
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
 /*   public Recipe(String ingridents, String cookingSteps, String imageUrl){
        super();
        this.ingridents=ingridents;
        this.cookingSteps=cookingSteps;
        this.imageUrl=imageUrl;
    }*/
}
