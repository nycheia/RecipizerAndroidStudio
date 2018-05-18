package com.example.dgl.recipizeras;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dgl on 09-05-2018.
 */

@SuppressWarnings("serial")
public class Recipe implements Serializable{
    public String title;
    public String description;
    public String note;
    public ArrayList<Ingredient> ingredients;

    public Recipe(String title, String description, ArrayList<Ingredient> ingredients){
        this.title = title;
        this.description = description;
        this.note = note;
        this.ingredients = ingredients;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
