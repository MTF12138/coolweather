package com.example.coolweather.gson;

import android.support.v4.media.session.PlaybackStateCompat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15014 on 2020/3/2.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
