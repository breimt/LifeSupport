package com.example.lifesupport.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lifesupport.R;


public class SpellBookActivity extends AppCompatActivity {

    private Button spellAddButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spell_book);

        spellAddButton = (Button)findViewById(R.id.spellAddButton);

        //OnClick for GroceryList button
        spellAddButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAddSpell();
            }
        });
    }

    private void openAddSpell() {
        Intent intent = new Intent(this, FuckYouActivity.class);
        startActivity(intent);
    }
}