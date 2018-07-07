package com.example.mysmall.libmodel.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * 作者: Nade_S on 2018/6/12.
 */

public class BaseActivity extends AppCompatActivity {
    public Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout();
        initView();
        initListener();
        context = this;
        AppManager.getAppManager().addActivity(this);
    }
        // 添加点击监听
    public void initListener() {

    }
        // 初始化数据
    public void initData() {

    }
        // 初始化试图
    public void initView() {

    }

    //添加视图
    public void setLayout() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.getAppManager().finishActivity();
    }

    @Override
    protected void onPause() {
        super.onPause();

    }


    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        long firstTime=0;
        if (keyCode==event.KEYCODE_BACK){
            if (AppManager.activityStack!=null&&AppManager.activityStack.size()==1){
                long secondTime= System.currentTimeMillis();
                if (secondTime-firstTime>=2000){
                    Toast.makeText(AppManager.getAppManager().currentActivity(), "再按一次退出程序", Toast.LENGTH_SHORT).show();
                    firstTime=System.currentTimeMillis();
                }else {
                    AppManager.getAppManager().AppExit(this);
                }
            }

        }

        return super.onKeyUp(keyCode, event);

    }
}
