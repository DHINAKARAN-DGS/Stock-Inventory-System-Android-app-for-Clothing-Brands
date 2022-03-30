package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ImageView addProducs;
    ImageView ordersProducs;
    ImageView detailsProducs;
    ImageView billProducs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addProducs = findViewById(R.id.product);

        addProducs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, AddProducts.class);
                startActivity(intent);
            }
        });

        ordersProducs = findViewById(R.id.order);

        ordersProducs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OrdersActivity.class);
                startActivity(intent);
            }
        });

        detailsProducs = findViewById(R.id.cut);

        detailsProducs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, AddDetails.class);
                startActivity(intent);
            }
        });

        billProducs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, )
            }
        });





        System.out.println("aaa");
        String url = "https://pragnyacollections.000webhostapp.com/addOrders.php";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println(response);
                    }
                }, new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {
                System.out.println("error: " + error.toString());
            }

        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> map = new HashMap<>();
                map.put("from_address", "title");
                map.put("to_address", "500");
                map.put("products", "500");
                map.put("total_price", "500");
                map.put("prices", "500");
                map.put("quantity", "500");
                map.put("date", "kurti");
                map.put("time", "kurti");
                map.put("discounts", "555");
                return map;
            }
        };
        RetryPolicy retryPolicy = new DefaultRetryPolicy(5000, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }
}