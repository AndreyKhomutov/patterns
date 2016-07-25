package com.mycompany.reailzations;

import com.mycompany.interfs.FlyBehavior;

/**
 * Created by andrey on 26.07.16.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
