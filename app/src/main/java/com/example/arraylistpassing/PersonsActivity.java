package com.example.arraylistpassing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class PersonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persons);

        Bundle bundle = getIntent().getExtras();

        ArrayList<Person> personArrayList = bundle.getParcelableArrayList("Person_List");

        if (personArrayList != null && !personArrayList.isEmpty()) {
            for (Person person : personArrayList) {
                Log.i("PersonsActivity", String.valueOf(person.id) + " | " + person.name + " | " + String.valueOf(person.age));
            }
        }
    }
}