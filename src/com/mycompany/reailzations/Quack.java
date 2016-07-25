package com.mycompany.reailzations;

import com.mycompany.interfs.QuackBehavior;

/**
 * Created by andrey on 26.07.16.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
