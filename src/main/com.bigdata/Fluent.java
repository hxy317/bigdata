package com.bigdata;

import org.fluentd.logger.FluentLogger;

import java.util.HashMap;
import java.util.Map;

public class Fluent {

    public static void main(String[] args) {
        String app = "bigdata.product";
        String host = "127.0.0.1";
        int port = 24224;
        FluentLogger fluentLogger = FluentLogger.getLogger(app, host, port);

        Map<String, Object> map = new HashMap<>();
        map.put("act", "act");
        map.put("user_id", "12247390");
        map.put("name", "name4");
        fluentLogger.log("test", map);
        System.out.println("fluent success");
    }

}
