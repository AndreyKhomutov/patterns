package com.mycompany.reailzations;

import com.mycompany.interfs.FlyBehavior;

/**
 * Created by andrey on 26.07.16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
