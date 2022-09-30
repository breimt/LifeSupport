package com.example.lifesupport.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lifesupport.Activities.GroceryListActivity;
import com.example.lifesupport.R;

public class MainActivity extends AppCompatActivity {

    //Button for changing to GroceryList activity
    private Button groceryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OnClick for GroceryList button
        groceryButton = (Button)findViewById(R.id.groceryListButton);
        groceryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGroceryListActivity();
            }
        });
    }

    public void openGroceryListActivity(){
        Intent intent = new Intent(this, GroceryListActivity.class);
        startActivity(intent);
    }


}