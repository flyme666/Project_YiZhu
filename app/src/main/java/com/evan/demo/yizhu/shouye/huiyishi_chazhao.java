package com.evan.demo.yizhu.shouye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.evan.demo.yizhu.R;

public class huiyishi_chazhao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huiyishi_chazhao);
        Button back = (Button)findViewById(R.id.huiyi_chazhao_back);
        Button btn1 = (Button)findViewById(R.id.huiyi_chazhao_btn1) ;
        Button btn2 = (Button)findViewById(R.id.huiyi_chazhao_btn2) ;
        Button btn3 = (Button)findViewById(R.id.huiyi_chazhao_btn3) ;
        Button btn4 = (Button)findViewById(R.id.huiyi_chazhao_btn4) ;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                huiyishi_chazhao.this.finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(huiyishi_chazhao.this,"报名成功",Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(huiyishi_chazhao.this,"报名成功",Toast.LENGTH_SHORT).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(huiyishi_chazhao.this,"报名成功",Toast.LENGTH_SHORT).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(huiyishi_chazhao.this,"报名成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
