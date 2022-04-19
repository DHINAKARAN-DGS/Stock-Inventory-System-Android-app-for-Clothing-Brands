package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrdersActivity extends AppCompatActivity {

    public static List<OrdersModel> ordersModelList = new ArrayList<>();
    public static List<ConfirmationModel> confirmationModelList = new ArrayList<>();
    RecyclerView recyclerView;
    OrdersAdapter adapter;
    Button contBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        recyclerView = findViewById(R.id.orders_rv);
        contBtn = findViewById(R.id.continueBtn);

        adapter = new OrdersAdapter(ordersModelList);
        adapter.notifyDataSetChanged();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        contBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int a=0;a< ordersModelList.size();a++){
                    confirmationModelList.add(new ConfirmationModel(ordersModelList.get(a).getPrice(),ordersModelList.get(a).getPrice()));
                    Toast.makeText(OrdersActivity.this, confirmationModelList.get(a).getMain(), Toast.LENGTH_SHORT).show();
                }
                Intent intent  = new Intent(OrdersActivity.this,ConfirmationActivity.class);
                startActivity(intent);
            }
        });

    }


}