package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ConfirmationActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ConfirmationAdapter adapter;
    List<ConfirmationModel> confirmationModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        confirmationModelList.add(new ConfirmationModel("bsaijfb",""));
        confirmationModelList.add(new ConfirmationModel("ajkbsfja",""));
        confirmationModelList.add(new ConfirmationModel("jabjsf",""));
        confirmationModelList.add(new ConfirmationModel("bajksbf",""));
        confirmationModelList.add(new ConfirmationModel("akjsbkja",""));

        adapter =new ConfirmationAdapter(confirmationModelList);
        adapter.notifyDataSetChanged();
//
        recyclerView = findViewById(R.id.confirmation_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}