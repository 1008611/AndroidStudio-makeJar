package com.wildwolf.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ${wild00wolf} on 2016/8/12.
 */
public class ProgressJarActivity extends Activity {

    Button btn ;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ResourceUtils.getIdByName(this, "layout", "activity_pro"));
//        setContentView(R.layout.activity_pro);

//        btn= (Button) findViewById(R.id.btn);
        btn= (Button) findViewById(ResourceUtils.getIdByName(this,"id","btn"));
//        tv= (TextView) findViewById(R.id.tv);
        tv= (TextView) findViewById(ResourceUtils.getIdByName(this,"id","tv"));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tv.setText("22222222222222222222");
            }
        });
    }
}
