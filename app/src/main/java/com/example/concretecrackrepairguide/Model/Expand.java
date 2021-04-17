package com.example.concretecrackrepairguide.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Expand implements Parcelable {
    String title,content;
    int background;
    boolean expanded;

    public Expand(String title, String content, int background) {
        this.title = title;
        this.content = content;
        this.background = background;
    }

    protected Expand(Parcel in) {
        title = in.readString();
        content = in.readString();
        background = in.readInt();
        expanded = in.readByte() != 0;
    }

    public static final Creator<Expand> CREATOR = new Creator<Expand>() {
        @Override
        public Expand createFromParcel(Parcel in) {
            return new Expand(in);
        }

        @Override
        public Expand[] newArray(int size) {
            return new Expand[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(content);
        dest.writeInt(background);
        dest.writeByte((byte) (expanded ? 1 : 0));
    }
}
