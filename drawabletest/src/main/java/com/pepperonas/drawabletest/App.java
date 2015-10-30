package com.pepperonas.drawabletest;

import android.app.Application;

import com.pepperonas.aesprefs.AesLogger;
import com.pepperonas.aesprefs.AesPrefs;
import com.pepperonas.andcommon.AndCommon;

/**
 * @author Martin Pfeffer (pepperonas)
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AesPrefs.init(this, "config", "123asdhfiudhf//T%R", AesLogger.Mode.ALL);

        AndCommon.init(this);
    }
}
