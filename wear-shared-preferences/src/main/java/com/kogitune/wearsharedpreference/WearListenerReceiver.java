package com.kogitune.wearsharedpreference;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class WearListenerReceiver extends BroadcastReceiver {
    public WearListenerReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (BuildConfig.DEBUG) {
            Log.d("WearListenerReceiver", "onReceive");
        }
        final Context applicationContext = context.getApplicationContext();
        intent.setClass(applicationContext, PreferencesSaveService.class);
        applicationContext.startService(intent);
    }
}
