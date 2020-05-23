package com.evan.demo.yizhu.shouye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.evan.demo.yizhu.R;

public class huiyishi_yuyue_shezhi_xiangqing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huiyishi_yuyue_shezhi_xiangqing);
        Button back = (Button)findViewById(R.id.huiyi_yuyue_back);
        Button zhifu = (Button)findViewById(R.id.huiyishi_shezhi_quzhifu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                huiyishi_yuyue_shezhi_xiangqing.this.finish();
            }
        });
        zhifu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                huiyishi_yuyue_shezhi_xiangqing.this.finish();
                Toast.makeText(huiyishi_yuyue_shezhi_xiangqing.this,"预约成功",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(huiyishi_yuyue_shezhi_xiangqing.this,huiyishi_yuyue.class);
                startActivity(i);

            }
        });

    }
}
