package com.example.jjdind49_katibar_zad26_1;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RecipeController {
    private RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/")
    String home() {
        return "home";
    }

    @GetMapping("/add")
    public String addRecipe(Model model) {
        Category[] categories = Category.values();
        model.addAttribute("categories", categories);
        model.addAttribute("newRecipe", new RecipeDto());
//        model.addAttribute("ingredientsList", new ArrayList<Ingredient>());
        model.addAttribute("size", 2);
        return "add";
    }

    @PostMapping (path = "/add", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
    public String addRecipeForm(@RequestBody RecipeDto dto, @RequestParam Ingredient ingredient1,
                                @RequestParam Ingredient ingredient2) {

        String title = dto.getTitle();
        Category category = dto.getCategory();
        String description = dto.getDescription();

//        List<Ingredient> ingredients = dto.getIngredients();
//        RecipeDto recipeDto = new RecipeDto(title, category, description);

        Recipe recipe = new Recipe(title, category, description);
        recipe.addIngredient(ingredient1);
        recipe.addIngredient(ingredient2);
        recipeRepository.save(recipe);

        return "home";
    }

}
