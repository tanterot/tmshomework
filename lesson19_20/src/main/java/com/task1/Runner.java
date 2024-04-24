package com.task1;

/**
 * Создать поток используя два способа - через наследованное и имплементируя интерфейс Runnable
 * Оба потока должны стартовать, после чего основной поток должен дождать ся их завершения и прекратить работу.
 */
public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()-> System.out.println("hello from thread is runnable"));
        MyThread myThread = new MyThread();

        thread.start();
        myThread.start();

        thread.join();
        myThread.join();


    }
}
