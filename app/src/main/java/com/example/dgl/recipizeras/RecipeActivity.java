package com.example.dgl.recipizeras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class RecipeActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private ArrayList<Ingredient> ingredients1;
    private ArrayList<Ingredient> ingredients2;
    private ArrayList<Recipe> recipes;
    private ArrayList<String> recipeNames;

    private Recipe recipe1;
    private Recipe recipe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ingredients1 = new ArrayList<>();
        ingredients2 = new ArrayList<>();

        Ingredient ingredient1 = new Ingredient("Estragon", "1", "g");
        Ingredient ingredient2 = new Ingredient("Brød", "2", "pcs");
        Ingredient ingredient3 = new Ingredient("Kartoffel", "10", "pcs");
        ingredients1.add(ingredient1);
        ingredients2.add(ingredient2);
        ingredients2.add(ingredient3);

        Recipe recipe1 = new Recipe("Omelette", "Rør nogle æg sammen og put det på en pande", ingredients1);
        Recipe recipe2 = new Recipe("Sandwich", "Klap to skiver brød sammen", ingredients2);

        recipes = new ArrayList<>();
        recipes.add(recipe1);
        recipes.add(recipe2);

        recipeNames = new ArrayList<>();

        for (Recipe item: recipes) {
            recipeNames.add(item.getTitle());
        }

        ListView recipeListView = findViewById(R.id.listView);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipeNames);
        recipeListView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        recipeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                navigateToViewRecipe(position);
            }
        });

    }

    public void navigateToViewRecipe(int position){
        Intent intent = new Intent(this, ViewRecipeActivity.class);
        Gson gson = new Gson();
        String recipeJson = gson.toJson(recipes.get(position));
        intent.putExtra("recipe", recipeJson);
        startActivity(intent);
    }
}
