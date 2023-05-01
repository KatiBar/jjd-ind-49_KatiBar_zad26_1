package com.example.jjdind49_katibar_zad26_1;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class RecipeDto {
    private String title;
    private Category category;
    private String description;
//    private List<Ingredient> ingredients = new ArrayList<>();

    public RecipeDto() {
    }

    public RecipeDto(String title, Category category, String description) {
        this.title = title;
        this.category = category;
        this.description = description;
//        this.ingredients = ingredients;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public List<Ingredient> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(List<Ingredient> ingredients) {
//        this.ingredients = ingredients;
//    }
}
