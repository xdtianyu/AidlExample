/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/ty/source/AidlExample/app/src/main/aidl/org/xdty/remoteservice/IRemoteService.aidl
 */
package org.xdty.remoteservice;

public interface IRemoteService extends android.os.IInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble,
            java.lang.String aString) throws android.os.RemoteException;

    public void addUser(org.xdty.remoteservice.User user) throws android.os.RemoteException;
    // in 表示传入数据， out 表示传出数据， inout 表示双向传递。注意含有 out 时 User 类需要实现 readFromParcel() 方法

    /** Local-side IPC implementation stub class. */
    public static abstract class Stub extends android.os.Binder
            implements org.xdty.remoteservice.IRemoteService {
        static final int TRANSACTION_basicTypes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
        static final int TRANSACTION_addUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
        private static final java.lang.String DESCRIPTOR = "org.xdty.remoteservice.IRemoteService";

        /** Construct the stub at attach it to the interface. */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an org.xdty.remoteservice.IRemoteService interface,
         * generating a proxy if needed.
         */
        public static org.xdty.remoteservice.IRemoteService asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof org.xdty.remoteservice.IRemoteService))) {
                return ((org.xdty.remoteservice.IRemoteService) iin);
            }
            return new org.xdty.remoteservice.IRemoteService.Stub.Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply,
                int flags) throws android.os.RemoteException {
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(DESCRIPTOR);
                    return true;
                }
                case TRANSACTION_basicTypes: {
                    data.enforceInterface(DESCRIPTOR);
                    int _arg0;
                    _arg0 = data.readInt();
                    long _arg1;
                    _arg1 = data.readLong();
                    boolean _arg2;
                    _arg2 = (0 != data.readInt());
                    float _arg3;
                    _arg3 = data.readFloat();
                    double _arg4;
                    _arg4 = data.readDouble();
                    java.lang.String _arg5;
                    _arg5 = data.readString();
                    this.basicTypes(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
                    reply.writeNoException();
                    return true;
                }
                case TRANSACTION_addUser: {
                    data.enforceInterface(DESCRIPTOR);
                    org.xdty.remoteservice.User _arg0;
                    if ((0 != data.readInt())) {
                        _arg0 = org.xdty.remoteservice.User.CREATOR.createFromParcel(data);
                    } else {
                        _arg0 = null;
                    }
                    this.addUser(_arg0);
                    reply.writeNoException();
                    return true;
                }
            }
            return super.onTransact(code, data, reply, flags);
        }

        private static class Proxy implements org.xdty.remoteservice.IRemoteService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            /**
             * Demonstrates some basic types that you can use as parameters
             * and return values in AIDL.
             */
            @Override
            public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
                    double aDouble, java.lang.String aString) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeInt(anInt);
                    _data.writeLong(aLong);
                    _data.writeInt(((aBoolean) ? (1) : (0)));
                    _data.writeFloat(aFloat);
                    _data.writeDouble(aDouble);
                    _data.writeString(aString);
                    mRemote.transact(Stub.TRANSACTION_basicTypes, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
            // in 表示传入数据， out 表示传出数据， inout 表示双向传递。注意含有 out 时 User 类需要实现 readFromParcel() 方法

            @Override
            public void addUser(org.xdty.remoteservice.User user)
                    throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    if ((user != null)) {
                        _data.writeInt(1);
                        user.writeToParcel(_data, 0);
                    } else {
                        _data.writeInt(0);
                    }
                    mRemote.transact(Stub.TRANSACTION_addUser, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }
    }
}
