package App.Controller;

import App.Service.RecipeDB;
import App.Model.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    RecipeDB recipeDB;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<Recipe> getRecipes(){
        return recipeDB.getRecipes();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void createRecipe(@RequestBody Recipe recipe){
        recipeDB.add(recipe);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateRecipes(@RequestBody ArrayList<Recipe> recipes){
        recipeDB.setRecipes(recipes);
    }

    @DeleteMapping("")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRecipes(){
        recipeDB.getRecipes().clear();
    }

    @GetMapping("/{index}")
    @ResponseStatus(HttpStatus.OK)
    public Recipe getRecipe(@PathVariable("index") int index){
        return recipeDB.getRecipe(index);
    }

    @PutMapping("/{index}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateRecipe(@PathVariable("index") int index, @RequestBody Recipe recipe){
        recipeDB.getRecipes().set(index, recipe);
    }

    @DeleteMapping("/{index}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRecipe(@PathVariable("index") int index){
        recipeDB.getRecipes().remove(index);
    }
}
