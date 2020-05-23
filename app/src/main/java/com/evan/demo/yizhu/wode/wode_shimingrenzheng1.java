package com.evan.demo.yizhu.wode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.evan.demo.yizhu.R;

public class wode_shimingrenzheng1 extends AppCompatActivity {

    private TextView tiaoguo;
    private Button back;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wode_shimingrenzheng1);
        tiaoguo = (TextView)findViewById(R.id.tiaoguo);
        back = (Button)findViewById(R.id.wode_back);
        next = (Button)findViewById(R.id.shimingrenzheng_next);

        tiaoguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wode_shimingrenzheng1.this.finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wode_shimingrenzheng1.this.finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(wode_shimingrenzheng1.this,com.evan.demo.yizhu.wode.wode_renlianrenzheng.class);
                startActivity(i);
            }
        });

    }
}
