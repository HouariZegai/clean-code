package com.houarizegai.designpatterns.proxy;

public class Telecom implements ISP {

    @Override
    public String serverSite(String url) {
        return String.format("https://%s.com", url);
    }
}
