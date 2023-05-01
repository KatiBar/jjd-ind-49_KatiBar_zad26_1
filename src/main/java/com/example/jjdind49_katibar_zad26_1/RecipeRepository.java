package com.example.jjdind49_katibar_zad26_1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface RecipeRepository extends CrudRepository <Recipe, Long> {
    List<Recipe> findAll();
    List<Recipe> findRecipesByCategory(Category category);
    Recipe findRecipeById(Long id);

}
