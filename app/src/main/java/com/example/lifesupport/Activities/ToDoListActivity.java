package com.example.lifesupport.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lifesupport.R;
import com.example.lifesupport.ToDoListPackage.ToDoItem;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {

    private ArrayList<ToDoItem> items; //holds to do list items
    private ArrayAdapter<ToDoItem> itemsAdapter; //populates list view for gui
    private ListView listView; //defines list view
    private Button itemAddButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        // gets the id of the following items and sets them
        listView = findViewById(R.id.listView);
        itemAddButton = findViewById(R.id.itemAddButton);

        // listener for itemAddButton
        itemAddButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                addItem(v);
            }
        });

        items = new ArrayList<>();
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(itemsAdapter);
        setUpListViewListener();

    }

    private void setUpListViewListener() {
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Context context = getApplicationContext();
                Toast.makeText(context, "Item Removed", Toast.LENGTH_LONG).show();

                items.remove(i); // removes item
                itemsAdapter.notifyDataSetChanged(); //updates gui
                return true;
            }
        });
    }

    private void addItem(View v){
        EditText input = findViewById(R.id.addToDo);
        ToDoItem itemNew = new ToDoItem(input.getText().toString());

        if(!(itemNew.getName().equals(""))){
            itemsAdapter.add(itemNew);
            input.setText("");
        }
        else{
            Toast.makeText(getApplicationContext(), "Please enter text..", Toast.LENGTH_LONG).show();
        }

    }


}