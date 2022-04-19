package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
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
    List<DisplayModel> sortedlist = new ArrayList<>();
    DisplayAdapter adapter;

    Spinner spinner;
    String arr[]={"Categories","chudi","cate","churidhar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = findViewById(R.id.ViewRV);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        spinner = findViewById(R.id.spinner);


        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arr);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, OrdersActivity.class);
                startActivity(intent);
            }
        });

        String url = "https://pragnyacollections.000webhostapp.com/getdata.php";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            displayModelList.clear();
                            sortedlist.clear();
                            JSONArray array = new JSONArray(response);
                            for (int x = 0; x < array.length(); x++) {
                                JSONObject object = array.getJSONObject(x);
                                String sizes = "S " + object.getString("S") +
                                        " | L " + object.getString("L") +
                                        " | M " + object.getString("M") +
                                        " | L " + object.getString("L") +
                                        " | XL " + object.getString("XL") +
                                        " | XXL " + object.getString("XXL") +
                                        " | XXXL " + object.getString("XXXL") +
                                        " | 4XL " + object.getString("IVXL") +
                                        " | 5XL " + object.getString("VXL") +
                                        " | FS " + object.getString("FS");

                                displayModelList.add(new DisplayModel(object.getString("product_title")
                                        , object.getString("product_price")
                                        , object.getString("product_image")
                                        , sizes
                                        , object.getString("category")
                                        , object.getString("product_id")));
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

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                sortedlist.clear();
                for (int a=0;a<displayModelList.size();a++){
                    if (arr[i].equals(displayModelList.get(a).getCat())){
                        sortedlist.add(new DisplayModel(displayModelList.get(a).getTitle(),displayModelList.get(a).getPrice(),displayModelList.get(a).getImage(),displayModelList.get(a).getSize(),displayModelList.get(a).getCat(),displayModelList.get(a).getId()));
                    }
                }
                if (sortedlist.size()>0){
                    adapter = new DisplayAdapter(sortedlist);
                    adapter.notifyDataSetChanged();
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        adapter = new DisplayAdapter(displayModelList);
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

    }


}