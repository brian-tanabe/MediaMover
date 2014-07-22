package com.tanabe.mm.application;

/**
 * Created by Brian on 7/21/2014.
 */
public class Application {

    protected static String getVersionString(){
        return "v0.0.1";
    }

    public static void main(String[] args){
        System.out.println(String.format("MediaMover: %s", getVersionString()));
    }
}
