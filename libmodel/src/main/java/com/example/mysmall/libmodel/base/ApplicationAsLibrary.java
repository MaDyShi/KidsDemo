package com.example.mysmall.libmodel.base;

import android.app.Application;

/**
 * Created by Nirui on 17/2/27.
 * 作为接口，方便主工程调度子模块的声明周期
 */

public interface ApplicationAsLibrary {

   void onCreateAsLibrary(Application application);
   void onLowMemoryAsLibrary(Application application);
   void onTrimMemoryAsLibrary(Application application, int level);

}
