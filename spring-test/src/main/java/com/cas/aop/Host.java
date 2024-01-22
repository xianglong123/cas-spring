package com.cas.aop;

/**
 * @author tl
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("租你3个月");
    }

    @Override
    public void go() {
        System.out.println("走吧，不租了");
    }

    @Override
    public void send() {
        System.out.println("不要钱，这房子送你了");
    }
}

