package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

import java.util.HashMap;
import java.util.Map;

public class AddProducts extends AppCompatActivity {

    EditText ptitle, pprice, sizes, sizel, sizem, sizexl, sizexxl, sizexxxl, size4xl, size5xl, sizefs;
    Button upload;
    ImageView pimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_products);


        ptitle = findViewById(R.id.product_title);
        pprice = findViewById(R.id.product_price);
        sizes = findViewById(R.id.size_s);
        sizem = findViewById(R.id.size_m);
        sizel = findViewById(R.id.size_l);
        sizexl = findViewById(R.id.size_xl);
        sizexxl = findViewById(R.id.size_xxl);
        sizexxxl = findViewById(R.id.size_xxxl);
        size4xl = findViewById(R.id.size_4xl);
        size5xl = findViewById(R.id.size_5xl);
        sizefs = findViewById(R.id.size_fs);
        pimage = findViewById(R.id.add_product_image);
        sizefs = findViewById(R.id.size_fs);
        upload = findViewById(R.id.upload_btn);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!ptitle.getText().toString().equals("")) {
                    if (!pprice.getText().toString().equals("")) {
                        if (!sizes.getText().toString().equals("")) {
                            if (!sizem.getText().toString().equals("")) {
                                if (!sizel.getText().toString().equals("")) {
                                    if (!sizel.getText().toString().equals("")) {
                                        if (!sizexl.getText().toString().equals("")) {
                                            if (!sizexxl.getText().toString().equals("")) {
                                                if (!sizexxxl.getText().toString().equals("")) {
                                                    if (!size4xl.getText().toString().equals("")) {
                                                        if (!size5xl.getText().toString().equals("")) {
                                                            if (!sizefs.getText().toString().equals("")) {
                                                                String url = "https://pragnyacollections.000webhostapp.com/addProducts.php";

                                                                StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                                                                        new Response.Listener<String>() {
                                                                            @Override
                                                                            public void onResponse(String response) {
                                                                                System.out.println(response);
                                                                                Toast.makeText(AddProducts.this, response, Toast.LENGTH_SHORT).show();
                                                                            }
                                                                        }, new Response.ErrorListener() {
                                                                    @Override
                                                                    public void onErrorResponse(VolleyError error) {
                                                                        System.out.println("error: " + error.toString());
                                                                    }

                                                                }) {
                                                                    @Override
                                                                    protected Map<String, String> getParams() {
                                                                        Map<String, String> hash = new HashMap<>();
                                                                        hash.put("product_title", ptitle.getText().toString());
                                                                        hash.put("product_price", pprice.getText().toString());
                                                                        hash.put("product_image", "img");
                                                                        hash.put("size_s", sizes.getText().toString());
                                                                        hash.put("size_l", sizel.getText().toString());
                                                                        hash.put("size_m", sizem.getText().toString());
                                                                        hash.put("size_xl", sizexl.getText().toString());
                                                                        hash.put("size_xxl", sizexxl.getText().toString());
                                                                        hash.put("size_xxxl", sizexxxl.getText().toString());
                                                                        hash.put("size_4xl", size4xl.getText().toString());
                                                                        hash.put("size_5xl", size5xl.getText().toString());
                                                                        hash.put("size_fs", sizefs.getText().toString());
                                                                        hash.put("category", "cate");
                                                                        hash.put("pid", "154");
                                                                        return hash;
                                                                    }
                                                                };

                                                                int socketTimeOut = 50000;
                                                                RetryPolicy policy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);

                                                                stringRequest.setRetryPolicy(policy);

                                                                RequestQueue queue = Volley.newRequestQueue(AddProducts.this);
                                                                queue.add(stringRequest);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });

    }
}