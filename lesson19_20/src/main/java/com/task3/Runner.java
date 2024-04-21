package com.task3;

/**
 * Создать поток демон и проверить его работу
 */

public class Runner {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello from is thread");

            }
        });
        Thread threadDaemon =  new Thread(()->{
            while (true){
                System.out.println("hello from demon thread");
            }
        });

        thread.start();

        threadDaemon.setDaemon(true);
        threadDaemon.start();

    }
}
