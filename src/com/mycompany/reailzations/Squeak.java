package com.mycompany.reailzations;

import com.mycompany.interfs.QuackBehavior;

/**
 * Created by andrey on 26.07.16.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
