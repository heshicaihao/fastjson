package com.heshicaihao.fastjson;

import com.alibaba.fastjson.JSON;
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
}
