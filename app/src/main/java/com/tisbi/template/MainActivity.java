package com.tisbi.template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewModelMainActivity viewModelMainActivity;
    RecyclerView recyclerView;
    PersonAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModelMainActivity = new ViewModelProvider(this).get(ViewModelMainActivity.class);

        recyclerView = findViewById(R.id.list);


        viewModelMainActivity.sendRequest();

        viewModelMainActivity.liveDataTextToView.observe(this, new Observer<ArrayList<Person>>() {
            @Override
            public void onChanged(ArrayList<Person> people) {
                setRecyclerView(people);
            }
        });
    }

    public void setRecyclerView(ArrayList<Person> people) {
        adapter = new PersonAdapter(this, people);
        recyclerView.setAdapter(adapter);
    }

}