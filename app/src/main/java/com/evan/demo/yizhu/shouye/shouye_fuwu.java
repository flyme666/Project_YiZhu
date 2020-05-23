package com.evan.demo.yizhu.shouye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.evan.demo.yizhu.R;

public class shouye_fuwu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shouye_fuwu);
        ImageButton back = (ImageButton)findViewById(R.id.fuwu_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shouye_fuwu.this.finish();
            }
        });
    }
}
