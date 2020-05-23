package com.evan.demo.yizhu.shouye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evan.demo.yizhu.R;

public class huiyishi_yuyue extends AppCompatActivity {
    private Button huiyi_yuyue_back ;
    private View huiyi_daxing;
    private View huiyi_zhongxing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huiyishi_yuyue);
        huiyi_yuyue_back = (Button)findViewById(R.id.huiyi_yuyue_back);
        huiyi_daxing = (View)findViewById(R.id.huiyishi_daxing);
        huiyi_zhongxing = (View)findViewById(R.id.huiyishi_zhongxing);

        huiyi_yuyue_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                huiyishi_yuyue.this.finish();
            }
        });

        huiyi_daxing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(huiyishi_yuyue.this,com.evan.demo.yizhu.shouye.huiyishi_yuyue_shezhi.class);
                startActivity(i);
            }
        });

        huiyi_zhongxing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(huiyishi_yuyue.this,com.evan.demo.yizhu.shouye.huiyishi_yuyue_shezhi.class);
                startActivity(i);
            }
        });

    }
}
