package com.evan.demo.yizhu.shouye;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evan.demo.yizhu.R;

public class huiyishi_wode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huiyishi_wode);
        Button back = (Button)findViewById(R.id.huiyi_wode_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                huiyishi_wode.this.finish();
            }
        });
    }
}
