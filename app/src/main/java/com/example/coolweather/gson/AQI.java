package com.example.coolweather.gson;

/**
 * Created by 15014 on 2020/3/2.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
