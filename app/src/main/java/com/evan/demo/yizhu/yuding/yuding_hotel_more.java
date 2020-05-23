package com.evan.demo.yizhu.yuding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.evan.demo.yizhu.R;

public class yuding_hotel_more extends AppCompatActivity {
    private int flag = 1;
    private Button back;
    private ImageButton shangla;
    private LinearLayout hotel_more;
    private Button yuyue1;
    private Button yuyue2;
    private Button yuyue3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuding_hotel_more);
        back = (Button)findViewById(R.id.hotel_more_back);
        shangla = (ImageButton)findViewById(R.id.hotel_shangla);
        hotel_more = (LinearLayout)findViewById(R.id.hotel_more);
        yuyue1 = (Button)findViewById(R.id.hotel_yuyue1);
        yuyue2 = (Button)findViewById(R.id.hotel_yuyue2);
        yuyue3 = (Button)findViewById(R.id.hotel_yuyue3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yuding_hotel_more.this.finish();
            }
        });
        shangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag == 1){
                    shangla.setImageDrawable(getResources().getDrawable(R.drawable.yuding_xiala));
                    hotel_more.setVisibility(View.GONE);
                    flag=0;
                }
                else {
                    shangla.setImageDrawable(getResources().getDrawable(R.drawable.hotel_more_jiantou));
                    hotel_more.setVisibility(View.VISIBLE);
                    flag=1;
                }
            }
        });

        yuyue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yuding_hotel_more.this,com.evan.demo.yizhu.yuding.yuding_yuyue.class);
                startActivity(i);
            }
        });
        yuyue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yuding_hotel_more.this,com.evan.demo.yizhu.yuding.yuding_yuyue.class);
                startActivity(i);
            }
        });
        yuyue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(yuding_hotel_more.this,com.evan.demo.yizhu.yuding.yuding_yuyue.class);
                startActivity(i);
            }
        });
    }
}
