package com.jceloto7.learning_heritage.service;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class GetRouterIPService extends Command {
    @Override
    protected String commandImpl() {
        String routerIP = null;

        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();

                if (networkInterface.isLoopback() || !networkInterface.isUp()) {
                    continue;
                }

                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress iNetAddress = addresses.nextElement();

                    if (iNetAddress.isSiteLocalAddress()) {
                        routerIP = iNetAddress.getHostAddress();
                        break;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("An unexpected error has occurred. Please try again.");
        }

        return (routerIP != null) ? "Router IP address: " + routerIP :
                "Unable to determine the router IP address.";
    }

}
