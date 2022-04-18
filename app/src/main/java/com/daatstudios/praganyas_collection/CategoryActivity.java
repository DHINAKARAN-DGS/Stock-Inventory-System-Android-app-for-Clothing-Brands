package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CategoryActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton floatingActionButton;

    List<DisplayModel> displayModelList = new ArrayList<>();
    DisplayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.ViewRV);
        floatingActionButton = findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this,OrdersActivity.class);
                startActivity(intent);
            }
        });

        String url = "https://pragnyacollections.000webhostapp.com/getdata.php";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray array = new JSONArray(response);
                            for (int x = 0; x < array.length(); x++) {
                                JSONObject object = array.getJSONObject(x);
                                System.out.println(object.getString("product_title"));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("error: " + error.toString());
            }

        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return super.getParams();
            }
        };

        int socketTimeOut = 50000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);

        stringRequest.setRetryPolicy(policy);

        RequestQueue queue = Volley.newRequestQueue(CategoryActivity.this);
        queue.add(stringRequest);


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