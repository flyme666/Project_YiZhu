package com.evan.demo.yizhu.shouye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;

public class shouye_huiyi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye_huiyi);
        ImageButton back = (ImageButton)findViewById(R.id.huiyi_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shouye_huiyi.this.finish();
            }
        });
        Button huiyi_yuyue = (Button)findViewById(R.id.huiyishi_yuyue);
        Button huiyi_wode = (Button)findViewById(R.id.huiyishi_wode);
        Button huiyi_chazhao = (Button)findViewById(R.id.huiyishi_chazhao);
        Button huiyi_fuwu = (Button)findViewById(R.id.huiyishi1_fuwu);
        huiyi_yuyue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shouye_huiyi.this,com.evan.demo.yizhu.shouye.huiyishi_yuyue.class);
                startActivity(i);
            }
        });
        huiyi_wode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shouye_huiyi.this,com.evan.demo.yizhu.shouye.huiyishi_wode.class);
                startActivity(i);
            }
        });
        huiyi_chazhao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shouye_huiyi.this,com.evan.demo.yizhu.shouye.huiyishi_chazhao.class);
                startActivity(i);
            }
        });
        huiyi_fuwu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(shouye_huiyi.this,com.evan.demo.yizhu.shouye.huiyishi_fuwu.class);
                startActivity(i);
            }
        });
    }
}
