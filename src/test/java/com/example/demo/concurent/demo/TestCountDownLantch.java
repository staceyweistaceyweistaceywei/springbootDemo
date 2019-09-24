package com.example.demo.conccurent.demo;

import java.util.concurrent.CountDownLatch;

/**
 * created by wyx on 2019/9/24
 *
 * CountDownLatch类位于java.util.concurrent包下，利用它可以实现类似计数器的功能。比如有一个任务A，
 * 它要等待其他4个任务执行完毕之后才能执行，此时就可以利用CountDownLatch来实现这种功能了。
 *
 * 代码来自：https://www.cnblogs.com/dolphin0520/p/3920397.html
 */
public class TestCountDownLantch {

    public static void tstCountDownLantch() {
        final CountDownLatch latch = new CountDownLatch(2);

        new Thread(){
            public void run() {
                try {
                    System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();

        new Thread(){
            public void run() {
                try {
                    System.out.println("子线程"+Thread.currentThread().getName()+"正在执行");
                    Thread.sleep(3000);
                    System.out.println("子线程"+Thread.currentThread().getName()+"执行完毕");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }.start();

        try {
            System.out.println("等待2个子线程执行完毕...");
            latch.await();
            System.out.println("2个子线程已经执行完毕");
            System.out.println("继续执行主线程");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
