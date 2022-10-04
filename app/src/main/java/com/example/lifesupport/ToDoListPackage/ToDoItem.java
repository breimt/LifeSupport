package com.example.lifesupport.ToDoListPackage;

public class ToDoItem {
    private String name;

    public ToDoItem(){
        name = "Unknown";
    }

    public ToDoItem(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}


