package com.evan.demo.yizhu.yuding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evan.demo.yizhu.R;

public class yuding_search_more extends AppCompatActivity {
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuding_search_more);
        back = (Button)findViewById(R.id.yuding_search_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yuding_search_more.this.finish();
            }
        });
    }
}
