package com.jacky.XHHlauncher.weather;

import android.os.Parcel;

import com.jacky.catlauncher.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiehuihong on 2017/1/24.
 */

public class WeatherModel {

    private int id;
    private int icon;
    private String title;
    private String content;

    private WeatherModel(final int id, final int icon,final String title, final String content){
        this.icon = icon;
        this.title = title;
        this.content = content;
    }

    protected WeatherModel(Parcel in){
        id = in.readInt();
        icon = in.readInt();
        title = in.readString();
        content = in.readString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIcon()
    {
        return icon;
    }

    public void setIcon(int icon)
    {
        this.icon = icon;
    }

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

    public static List<WeatherModel> getWeatherModel() {
        List<WeatherModel> weatherModels = new ArrayList<>();

        int icon[] = {
                R.drawable.ic_weather_mostly_sunny,
                R.drawable.ic_weather_raining,
                R.drawable.ic_weather_sleet,
                R.drawable.ic_weather_storm,
                R.drawable.ic_weather_sunny_rain,
        };

        String titles[] = {
                "今天",
                "周一",
                "周二",
                "周三",
                "周四",
        };

        String contents[] = {
                "晴转多云  温度：17〜24",
                "小雨  温度：13〜20",
                "雨雪天气  温度：3〜10",
                "雷阵雨  温度：18〜25",
                "晴转多云  温度：18〜23",
        };



        for (int i = 0; i < titles.length; i++) {
            WeatherModel weatherModel = new WeatherModel(0, icon[i],titles[i], contents[i]);
            weatherModels.add(weatherModel);
        }

        return weatherModels;
    }
}
