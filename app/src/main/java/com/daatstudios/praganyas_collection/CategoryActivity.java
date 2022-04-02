package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<DisplayModel> displayModelList = new ArrayList<>();
    DisplayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.ViewRV);

        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));
        displayModelList.add(new DisplayModel("Kurti","550","","4 5 8 6 7 2 9 21 8 26 48 2 28"));

        adapter  = new DisplayAdapter(displayModelList);
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);




    }
}