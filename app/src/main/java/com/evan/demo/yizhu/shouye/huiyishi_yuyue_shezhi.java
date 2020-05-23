package com.evan.demo.yizhu.shouye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evan.demo.yizhu.R;

public class huiyishi_yuyue_shezhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huiyishi_yuyue_shezhi);
        Button next = (Button)findViewById(R.id.huiyishi_shezhi_xiayibu);
        Button back = (Button)findViewById(R.id.huiyi_yuyue_back);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(huiyishi_yuyue_shezhi.this,com.evan.demo.yizhu.shouye.huiyishi_yuyue_shezhi_xiangqing.class);
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                huiyishi_yuyue_shezhi.this.finish();
            }
        });

    }
}
