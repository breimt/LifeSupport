package com.example.lifesupport.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lifesupport.R;

public class MainActivity extends AppCompatActivity {

    //Creating the buttons
    private Button groceryButton;
    private Button toDoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groceryButton = (Button)findViewById(R.id.groceryListButton);
        toDoButton = (Button)findViewById(R.id.toDoListButton);


        //OnClick for GroceryList button
        groceryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGroceryListActivity();
            }
        });


        //OnClick for ToDoList button
        toDoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openToDoListActivity();
            }
        });


    }

    public void openToDoListActivity(){
        Intent intent = new Intent(this, ToDoListActivity.class);
        startActivity(intent);
    }

    public void openGroceryListActivity(){
        Intent intent = new Intent(this, GroceryListActivity.class);
        startActivity(intent);
    }



}