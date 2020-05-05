package App.Service;

import App.Model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RecipeDB {

    private ArrayList<Recipe> recipes;
    private static RecipeDB instance = null;

    public static RecipeDB getInstance() {
        if (instance == null){
            instance = new RecipeDB();
        }
        return instance;
    }

    private RecipeDB(){
        recipes = new ArrayList<Recipe>();
        recipes.add(new Recipe("Burger", "Easy and tasty", "https://upload.wikimedia.org/wikipedia/commons/0/0b/RedDot_Burger.jpg"));
        recipes.add(new Recipe("Pizza", "Very Italian", "https://img.freepik.com/free-photo/delicious-fresh-pizza-served-wooden-table_127657-159.jpg?size=626&ext=jpg"));
    }

    public ArrayList<Recipe> getRecipes(){
        return recipes;
    }

    public Recipe getRecipe(int index){
        return recipes.get(index);
    }

    public void add(Recipe recipe) {
        recipes.add(recipe);
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }
}
