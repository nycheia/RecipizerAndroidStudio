package com.example.dgl.recipizeras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import org.w3c.dom.Text;


public class ViewRecipeActivity extends AppCompatActivity {

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recipe);

        TextView textRecipeName_ViewRecipe = (TextView) findViewById(R.id.textRecipeName_ViewRecipe);
        TextView textRecipeDescription_ViewRecipe = (TextView) findViewById(R.id.textRecipeDescription_ViewRecipe);
        TextView textRecipeNote_ViewRecipe = (TextView) findViewById(R.id.textRecipeNote_ViewRecipe);
        ListView ingredientListView_ViewRecipe = findViewById(R.id.ingredientListView_ViewRecipe);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        ingredientListView_ViewRecipe.setAdapter(adapter);

        Intent intent = getIntent();
        String recJson = getIntent().getStringExtra("recipe");
        /*Recipe recipe = (Recipe)intent.getSerializableExtra("recipe");*/
        Gson gson = new Gson();
        Recipe recipe = gson.fromJson(recJson, Recipe.class);


        textRecipeName_ViewRecipe.setText(recipe.getTitle());
        textRecipeDescription_ViewRecipe.setText(recipe.getDescription());
        textRecipeNote_ViewRecipe.setText(recipe.getNote());
        adapter.addAll(recipe.ingredients);
    }
}
