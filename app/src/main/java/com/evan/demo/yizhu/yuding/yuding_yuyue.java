package com.evan.demo.yizhu.yuding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.evan.demo.yizhu.R;

public class yuding_yuyue extends AppCompatActivity {
    private Button back;
    private Button queding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuding_yuyue);
        back = (Button)findViewById(R.id.hotel_yuyue_back);
        queding = (Button)findViewById(R.id.hotel_yuyue_queding);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yuding_yuyue.this.finish();
            }
        });
        queding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(yuding_yuyue.this,"预订成功",Toast.LENGTH_SHORT).show();
                yuding_yuyue.this.finish();
            }
        });
    }
}
