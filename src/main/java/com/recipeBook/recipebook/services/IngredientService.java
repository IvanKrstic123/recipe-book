package com.recipeBook.recipebook.services;

import com.recipeBook.recipebook.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
