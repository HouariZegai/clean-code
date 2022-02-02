package com.houarizegai.designpatterns.proxy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ProxyTest {

    @Test
    public void clientTest() {
        List<String> sites = Arrays.asList("facebook", "github", "quora", "stackoverflow", "twitter", "youtube");

        ISP intenet = new InternetProxy();

        for(String site : sites) {
            System.out.println(intenet.serverSite(site));
        }
    }
}