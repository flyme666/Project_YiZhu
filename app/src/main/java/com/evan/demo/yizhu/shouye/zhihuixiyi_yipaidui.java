package com.evan.demo.yizhu.shouye;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.evan.demo.yizhu.MainActivity;
import com.evan.demo.yizhu.R;

import java.util.Timer;
import java.util.TimerTask;

public class zhihuixiyi_yipaidui extends AppCompatActivity {

    private Boolean A=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhihuixiyi_yipaidui);
        ImageButton back = (ImageButton)findViewById(R.id.paidui_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zhihuixiyi_yipaidui.this.finish();
            }
        });

        TextView tixing_time = (TextView)findViewById(R.id.tixing_time);
        tixing_time.getPaint().setFlags(Paint. UNDERLINE_TEXT_FLAG );

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(A==true) {
                    Intent intent = new Intent(zhihuixiyi_yipaidui.this, com.evan.demo.yizhu.shouye.zhihuixiyi_yilundao.class);
                    startActivity(intent);
                    finish();
                }
            }
        },5000);
    }


}
