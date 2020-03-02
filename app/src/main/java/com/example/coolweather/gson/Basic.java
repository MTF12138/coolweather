package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15014 on 2020/3/2.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
