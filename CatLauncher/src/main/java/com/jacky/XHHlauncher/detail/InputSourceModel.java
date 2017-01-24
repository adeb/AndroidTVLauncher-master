package com.jacky.XHHlauncher.detail;

import android.os.Parcel;


import java.util.ArrayList;
import java.util.List;
import com.jacky.catlauncher.R;

/**
 * Created by xiehuihong on 2017/1/23.
 */

public class InputSourceModel {
    private int id;
    private int icon;
    private String title;
    private String content;

    private InputSourceModel(final int id, final int icon,final String title, final String content){
        this.icon = icon;
        this.title = title;
        this.content = content;
    }

    protected InputSourceModel(Parcel in){
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

    public static List<InputSourceModel> getInputSourceModel() {
        List<InputSourceModel> inputsourcemodels = new ArrayList<>();

        int icon[] = {
                R.drawable.ic_app_television,
                R.drawable.ic_app_hdmi,
                R.drawable.ic_app_hdmi,
                R.drawable.ic_app_hdmi,
                R.drawable.ic_app_av,
                R.drawable.ic_app_vga,
        };

        String titles[] = {
                "TV",
                "HDMI1",
                "HDMI2",
                "HDMI3",
                "AV",
                "VGA",
        };

        String contents[] = {
                "TV频道",
                "机顶盒",
                "游戏机",
                "DVD家庭影院",
                "其它",
                "电脑",
        };



        for (int i = 0; i < titles.length; i++) {
            InputSourceModel inputsourcemodel = new InputSourceModel(0, icon[i],titles[i], contents[i]);
            inputsourcemodels.add(inputsourcemodel);
        }

        return inputsourcemodels;
    }

}
