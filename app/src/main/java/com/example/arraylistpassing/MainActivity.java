package com.example.arraylistpassing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person(1, "Person A", 20));
        personArrayList.add(new Person(2, "Person B", 30));
        personArrayList.add(new Person(3, "Person C", 40));

        Intent intent = new Intent(this, PersonsActivity.class);
        intent.putExtra("Person_List", personArrayList);
        startActivity(intent);
    }
}