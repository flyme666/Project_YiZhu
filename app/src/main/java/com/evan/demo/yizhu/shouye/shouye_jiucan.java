package com.evan.demo.yizhu.shouye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;

public class shouye_jiucan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye_jiucan);
        ImageButton back = (ImageButton)findViewById(R.id.jiucan_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shouye_jiucan.this.finish();
            }
        });
    }
}
