package com.houarizegai.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Light> lights = new ArrayList<>();

    public void register(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        lights.stream().filter(light -> !light.isOn()).forEach(Light::toggle);
    }

    public void turnOffAllLight() {
        lights.stream().filter(Light::isOn).forEach(Light::toggle);
    }
}