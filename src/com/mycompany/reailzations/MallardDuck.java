package com.mycompany.reailzations;

import com.mycompany.Duck;
import com.mycompany.interfs.FlyBehavior;
import com.mycompany.interfs.QuackBehavior;

/**
 * Created by andrey on 26.07.16.
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard duck");
    }
}
