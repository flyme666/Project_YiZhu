package com.evan.demo.yizhu.yuding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;

public class yuding_search extends AppCompatActivity {
    private ImageButton search_more1;
    private ImageButton search_more2;
    private ImageButton search_more3;
    private ImageButton search_more4;
    private Button back;
    private ImageButton search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuding_search);
        search = (ImageButton)findViewById(R.id.search_more);
        search_more1 = (ImageButton)findViewById(R.id.search_more1);
        search_more2 = (ImageButton)findViewById(R.id.search_more2);
        search_more3 = (ImageButton)findViewById(R.id.search_more3);
        search_more4 = (ImageButton)findViewById(R.id.search_more4);
        back = (Button)findViewById(R.id.yuding_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yuding_search.this.finish();
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yuding_search.this,com.evan.demo.yizhu.yuding.yuding_search_more.class);
                startActivity(i);
            }
        });
        search_more1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yuding_search.this,com.evan.demo.yizhu.yuding.yuding_hotel_more.class);
                startActivity(i);
            }
        });
        search_more2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yuding_search.this,com.evan.demo.yizhu.yuding.yuding_hotel_more.class);
                startActivity(i);
            }
        });
        search_more3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yuding_search.this,com.evan.demo.yizhu.yuding.yuding_hotel_more.class);
                startActivity(i);
            }
        });
        search_more4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yuding_search.this,com.evan.demo.yizhu.yuding.yuding_hotel_more.class);
                startActivity(i);
            }
        });
    }
}
