package com.example.dgl.recipizeras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRecipeNavMain = (Button)findViewById(R.id.btn_recipeNav_Main);

        btnRecipeNavMain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                recipeNavigation();
            }
        });
    }

    public void recipeNavigation(){
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }
}
