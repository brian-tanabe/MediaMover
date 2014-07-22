package com.tanabe.mm.json;

/**
 * Created by Brian on 7/21/2014.
 */
public class Show {
    private int priority;
    private String name;

    public Show(int priority, String name){
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }
}
