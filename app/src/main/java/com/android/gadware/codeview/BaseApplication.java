package com.android.gadware.codeview;

import android.app.Application;

import com.android.gadware.codeview.classifier.CodeProcessor;


public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // train classifier on app start
        CodeProcessor.init(this);
    }
}
