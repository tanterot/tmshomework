package com.task4;

/**
 * Есть два потока - один выводит в бесконечном цикле 3 раза цифру "1" (3 вызова System.out.println), а второй аналогично - цифру "2". Предусмотреть небольшую задержку.
 * Задача - сделать синхронизацию потоков (пока один не закончит вывод трех чисел, второй будет ждать - не будет перемешивания)
 * Проверить что в консоли вы получите поочередное выполнение потоков.
 */
public class Runner {
    public static void main(String[] args) {
        Marker marker = new Marker();
        MyThread1 myThread1 = new MyThread1(marker);
        MyThread2 myThread2 = new MyThread2(marker);

        myThread1.start();
        myThread2.start();

    }
}
