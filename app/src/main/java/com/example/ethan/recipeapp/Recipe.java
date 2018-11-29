package com.example.ethan.recipeapp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recipe {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("recipes")
    @Expose
    private List<Recipe_> recipes = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Recipe() {
    }

    /**
     *
     * @param count
     * @param recipes
     */
    public Recipe(Integer count, List<Recipe_> recipes) {
        super();
        this.count = count;
        this.recipes = recipes;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Recipe_> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe_> recipes) {
        this.recipes = recipes;
    }

}