package com.heshicaihao.fastjson;

/**
 * Created by 80003074 on 2018/8/29.
 */

public class MenuBean {
    public String name;
    public int ResId;
    public int codeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {
        return ResId;
    }

    public void setResId(int resId) {
        ResId = resId;
    }


    public int getCodeId() {
        return codeId;
    }

    public void setCodeId(int codeId) {
        this.codeId = codeId;
    }

    public MenuBean(String name, int resId, int codeId) {
        this.name = name;
        ResId = resId;
        this.codeId = codeId;
    }

    public MenuBean(String name, int resId) {
        this.name = name;
        ResId = resId;
    }
}
