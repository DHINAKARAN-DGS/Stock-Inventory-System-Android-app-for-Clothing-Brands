package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class OrdersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        readStatus();

    }

    private void readStatus() {

        String url = "https://pragnyacollections.000webhostapp.com/getdata.php";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                response -> {
                    System.out.println(response);
                },

                error -> {
                    Toast.makeText(OrdersActivity.this, "Error 404 Data Not Found", Toast.LENGTH_SHORT).show();
                }
        );

        int socketTimeOut = 50000;
        RetryPolicy policy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);

        stringRequest.setRetryPolicy(policy);

        RequestQueue queue = Volley.newRequestQueue(OrdersActivity.this);
        queue.add(stringRequest);


    }

}