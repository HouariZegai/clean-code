package com.houarizegai.designpatterns.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements ISP {

    private List<String> blockedSites = Arrays.asList("facebook", "twitter", "youtube");

    @Override
    public String serverSite(String url) {
        logSite(url);
        if(blockedSites.contains(url)) {
            return "Naughty Boy, this site is blocked.";
        }

        return new Telecom().serverSite(url);
    }

    private void logSite(String url) {
        System.out.printf("[%d] %s%n", System.currentTimeMillis(), url);
    }
}
