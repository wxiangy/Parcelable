package com.example.wxy_pc.parcelabledemo;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import java.util.Map;

/**
 * Created by wxy-pc on 2015/6/2.
 */
public class InfoBean implements Parcelable {
    private String text;
    private String text1;
    private String text2;
    private String text3;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(text);
        dest.writeString(text1);
        dest.writeString(text2);
        dest.writeString(text3);

    }

    public InfoBean(Parcel in) {
        this.text = in.readString();
        this.text1 = in.readString();
        this.text2 = in.readString();
        this.text3 = in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

        @Override
        public Object createFromParcel(Parcel source) {
            return new InfoBean(source);
        }

        @Override
        public Object[] newArray(int size) {
            return new InfoBean[size];
        }
    };

    public InfoBean(String text, String text1, String text2, String text3) {
        this.text = text;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }
}
