package com.evan.demo.yizhu.shouye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.evan.demo.yizhu.R;

public class shouye_zhihuixiyi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye_zhihuixiyi);
        ImageButton back = (ImageButton)findViewById(R.id.xiyi_back);
        Button btn_paidui1 = (Button)findViewById(R.id.xiyifang_paidui1);
        Button btn_paidui2 = (Button)findViewById(R.id.xiyifang_paidui2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shouye_zhihuixiyi.this.finish();
            }
        });

        btn_paidui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(shouye_zhihuixiyi.this,com.evan.demo.yizhu.shouye.zhihuixiyi_yipaidui.class);
                startActivity(i);
            }
        });
        btn_paidui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(shouye_zhihuixiyi.this,com.evan.demo.yizhu.shouye.zhihuixiyi_yipaidui.class);
                startActivity(i);
            }
        });
    }
}
