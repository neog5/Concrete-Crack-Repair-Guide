package com.example.concretecrackrepairguide.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class CrackModel implements Parcelable {
    int pic;
    String name;

    public CrackModel(int pic, String name) {
        this.pic = pic;
        this.name = name;
    }

    protected CrackModel(Parcel in) {
        pic = in.readInt();
        name = in.readString();
    }

    public static final Creator<CrackModel> CREATOR = new Creator<CrackModel>() {
        @Override
        public CrackModel createFromParcel(Parcel in) {
            return new CrackModel(in);
        }

        @Override
        public CrackModel[] newArray(int size) {
            return new CrackModel[size];
        }
    };

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(pic);
        dest.writeString(name);
    }
}
