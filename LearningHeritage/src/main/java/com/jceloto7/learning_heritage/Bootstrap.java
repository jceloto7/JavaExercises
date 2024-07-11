package com.jceloto7.learning_heritage;

import com.jceloto7.learning_heritage.service.GetOSService;
import com.jceloto7.learning_heritage.service.GetRouterIPService;
import com.jceloto7.learning_heritage.service.JavaVersionService;
import com.jceloto7.learning_heritage.service.PingService;
import com.jceloto7.learning_heritage.util.InputUtil;

public class Bootstrap {
    public static InputUtil inputUtil;
    public static GetRouterIPService getRouterIPService;
    public static PingService pingService;
    public static JavaVersionService javaVersionService;
    public static GetOSService getOSService;

    public static void start(){
        inputUtil = new InputUtil();
        getRouterIPService = new GetRouterIPService();
        pingService = new PingService();
        javaVersionService = new JavaVersionService();
        getOSService = new GetOSService();
    }

}
