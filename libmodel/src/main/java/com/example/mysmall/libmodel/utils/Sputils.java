package com.example.mysmall.libmodel.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 作者: Nade_S on 2018/6/22.
 */

public class Sputils {
    private Context context;
    private SharedPreferences sp;
    public Sputils(Context context) {
        this.context = context;
        getSpInstance();
    }
    public SharedPreferences getSpInstance(){
        if (sp == null){
            synchronized (this){
                if (sp == null){
                    sp = context.getSharedPreferences("myapp",Context.MODE_PRIVATE);
                }
            }
        }
        return sp;
    }

    public void setIntValue(String key,int value){

        sp.edit().putInt(key,value).commit();
    }

    public int getIntValue(String key){
        return sp.getInt(key,-1);
    }

    public void setStringValue(String key,String value){
        sp.edit().putString(key,value).commit();
    }
    public String getStringValue(String key){
        return sp.getString(key,"");
    }

    public void setLongValue(String key,Long value){
        sp.edit().putLong(key,value).commit();
    }
    public Long getLongValue(String key){
        return sp.getLong(key,-404);
    }
    public void setBooleanValue(String key,boolean value){
        sp.edit().putBoolean(key,value).commit();
    }
    public boolean getBooleanValue(String key){
        return sp.getBoolean(key,false);
    }

}
