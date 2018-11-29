package com.example.ethan.recipeapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ingredients {

    @SerializedName("recipe")
    @Expose
    private Ingredients_ ingredients_;

    /**
     * No args constructor for use in serialization
     *
     */
    public Ingredients() {
    }

    /**
     *
     * @param ingredients_
     */
    public Ingredients(Ingredients_ ingredients_) {
        super();
        this.ingredients_ = ingredients_;
    }

    public Ingredients_ getIngredients_() {
        return ingredients_;
    }

    public void setIngredients_(Ingredients_ ingredients_) {
        this.ingredients_ = ingredients_;
    }

}

