package org.xdty.remoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class RemoteService extends Service {
    private static final String TAG = RemoteService.class.getSimpleName();
    private IBinder mBinder = new IRemoteService.Stub() {
        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
                double aDouble, String aString) throws RemoteException {
            Log.d(TAG, "basicTypes: ");
        }

        @Override
        public void addUser(User user) throws RemoteException {
            Log.d(TAG, "addUser: " + user.name);
        }
    };

    public RemoteService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
