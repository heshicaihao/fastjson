package com.heshicaihao.fastjson;

import android.content.Context;
import android.content.SharedPreferences;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import static android.content.Context.MODE_PRIVATE;

/***
 *                    .::::.
 *                  .::::::::.
 *                 :::::::::::
 *             ..:::::::::::'
 *           '::::::::::::'
 *             .::::::::::
 *        '::::::::::::::..
 *             ..::::::::::::.
 *           ``::::::::::::::::
 *            ::::``:::::::::'        .:::.
 *           ::::'   ':::::'       .::::::::.
 *         .::::'      ::::     .:::::::'::::.
 *        .:::'       :::::  .:::::::::' ':::::.
 *       .::'        :::::.:::::::::'      ':::::.
 *      .::'         ::::::::::::::'         ``::::.
 *  ...:::           ::::::::::::'              ``::.
 * ```` ':.          ':::::::::'                  ::::..
 *                    '.:::::'                    ':'````..
 *
 *
 *
 * Heshicaihao
 * 描述：
 * 2019/9/16. 11:21
 */
public class Test {

    public static MenuBean getMenuBean (String string) {
        MenuBean obean = JSON.parseObject(String.valueOf(string), MenuBean.class);
        return  obean;
    }


    /**
     * 保存用户登录信息
     */
    public static String saveUserInformation(Context ctx, MenuBean usetinformation) {
        Gson gson = new Gson();
        String json = gson.toJson( usetinformation );
        return  json;
    }

    /**
     * 读取上次用户登录信息
     */
    public static MenuBean getOldUserInformation(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<MenuBean>() {
        }.getType();
        MenuBean bean = gson.fromJson( json, type );
        return bean;
    }

}
