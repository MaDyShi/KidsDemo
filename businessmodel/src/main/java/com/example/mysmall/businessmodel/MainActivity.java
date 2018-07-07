package com.example.mysmall.businessmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.mysmall.libmodel.router.ConstantRouterUri;

//@Route(path = "/business/activity/main")
@Route(path = ConstantRouterUri.BusinessMainUri)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity_main);
        findViewById(R.id.business_jump_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/app/activity/main").withInt("age",34).withString("name","梅西").navigation();
            }
        });
        int age = getIntent().getIntExtra("age",0);
        String name = getIntent().getStringExtra("name");
        Toast.makeText(this, "businessMain---"+name+age, Toast.LENGTH_SHORT).show();
        // 组件化 组件化开发 路由Arouter 中间件
    }
}
