package com.devglan.userportal.model;

import java.util.HashMap;
import java.util.Map;

public class DaysModel {
    public Map<String, Integer> days;

    DaysModel() {
        days = new HashMap<String, Integer>();
        days.put("Monday", 1);
        days.put("Tuesday", 2);
        days.put("Wednesday", 3);
        days.put("Thursday", 4);
        days.put("Friday",5);
        days.put("Saterday", 6);
        days.put("Sunday",7);
    }
}
