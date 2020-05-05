package App.Controller;

import App.MockData.RecipeDB;
import App.Model.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("recipes")
public class RecipeController {

    @Autowired
    RecipeDB recipeDB;

    @GetMapping("")
    public ArrayList<Recipe> getRecipes(){
        return recipeDB.getRecipes();
    }

    @PostMapping("")
    public void createRecipe(@RequestBody Recipe recipe){
        recipeDB.add(recipe);
    }

    @PutMapping("")
    public void updateRecipes(@RequestBody ArrayList<Recipe> recipes){
        recipeDB.setRecipes(recipes);
    }

    @DeleteMapping("")
    public void deleteRecipes(){
        recipeDB.getRecipes().clear();
    }

    @GetMapping("/{index}")
    public Recipe getRecipe(@PathVariable("index") int index){
        return recipeDB.getRecipe(index);
    }

    @PutMapping("/{index}")
    public void updateRecipe(@PathVariable("index") int index, @RequestBody Recipe recipe){
        recipeDB.getRecipes().set(index, recipe);
    }

    @DeleteMapping("/{index}")
    public void deleteRecipe(@PathVariable("index") int index){
        recipeDB.getRecipes().remove(index);
    }
}
