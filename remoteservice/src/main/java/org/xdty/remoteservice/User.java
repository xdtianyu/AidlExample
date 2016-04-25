package org.xdty.remoteservice;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    // 必须实现，用于从 Parcel 对象中生成类实例
    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
    
    private int uid;
    private String name;

    // 从 Parcel 中读取数据，顺序需要和写入保持一致
    protected User(Parcel in) {
        uid = in.readInt();
        name = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // 将数据写入到 Parcel 中， 顺序需要与读取保持一致
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(uid);
        dest.writeString(name);
    }
}
