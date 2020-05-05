package App.Controller;

import App.MockData.RecipeDB;
import App.Model.Recipe;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("recipes")
public class RecipeController {

    RecipeDB recipeDB = RecipeDB.getInstance();

    @GetMapping("")
    public ArrayList<Recipe> getRecipes(){
        return recipeDB.getRecipes();
    }

    @GetMapping("/{index}")
    public Recipe getRecipe(@PathVariable("index") int index){
        return recipeDB.getRecipe(index);
    }
}
