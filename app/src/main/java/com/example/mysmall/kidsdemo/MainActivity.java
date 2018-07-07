package com.example.mysmall.kidsdemo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.mysmall.libmodel.utils.Sputils;


@Route(path = "/app/activity/main")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.app_jump_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/business/activity/main").withInt("age",33).withString("name","c罗").navigation();
            }
        });

        int age = getIntent().getIntExtra("age",0);
        String name = getIntent().getStringExtra("name");
        Toast.makeText(this, "appMain---"+name+age, Toast.LENGTH_SHORT).show();



    }
}
