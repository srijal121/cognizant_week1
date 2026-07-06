package com.cognizant.proxy;

public class ProxyInternet implements Internet {

    private RealInternet internet = new RealInternet();

    @Override
    public void connectTo(String server) {

        if(server.equalsIgnoreCase("facebook.com")) {
            System.out.println("Access Denied!");
        }
        else {
            internet.connectTo(server);
        }

    }
}