package com.example.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;


public class MyService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new Mybind();
    }

    class Mybind extends IMyAidlInterface.Stub {

        @Override
        public String getString() throws RemoteException {
            String string = "我是从服务起返回的";

            return string;
        }
    }
}
