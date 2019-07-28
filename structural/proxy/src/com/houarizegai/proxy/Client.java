package com.houarizegai.proxy;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<String> sites = Arrays.asList("facebook", "github", "quora", "stackoverflow", "twitter", "youtube");

        ISP intenet = new InternetProxy();

        for(String site : sites) {
            System.out.println(intenet.serverSite(site));
        }
    }
}
