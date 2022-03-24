package com.daatstudios.praganyas_collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {

    TextView c1,c2,c3,c4,c5,c6,c7,c8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        c1=findViewById(R.id.textView);
        c2=findViewById(R.id.textView2);
        c3=findViewById(R.id.textView4);
        c4=findViewById(R.id.textView5);
        c5=findViewById(R.id.textView6);
        c6=findViewById(R.id.textView7);
        c7=findViewById(R.id.textView8);
        c8=findViewById(R.id.textView9);



    }
}