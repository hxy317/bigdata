package com.bigdata;

import org.fluentd.logger.FluentLogger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Fluent {

    private static FluentLogger fluentLogger = FluentLogger.getLogger("bigdata.product", "127.0.0.1", 24224);

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("act", "act");
        map.put("user_id", "12247390");
        map.put("name", "name");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        int counts = 50;

        int flag = 0;
        while (flag < counts) {
            try {
                Thread.sleep(1 * 1000); //设置暂停的时间 5 秒
                map.put("time", sdf.format(new Date()));
                fluentLogger.log("test", map);
                flag++;
                System.out.println(sdf.format(new Date()) + "--循环执行第" + flag + "次");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
