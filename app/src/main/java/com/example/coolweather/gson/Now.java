package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15014 on 2020/3/2.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
