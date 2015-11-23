package com.example.arraylistpassing;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    int id;
    String name;
    int age;

    Person (Parcel in){
        this.id = in.readInt();
        this.name = in.readString();
        this.age = in.readInt();
    }

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }

    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
