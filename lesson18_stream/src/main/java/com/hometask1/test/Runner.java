package com.hometask1.test;

import com.hometask1.shop.Category;
import com.hometask1.shop.Manufacturer;
import com.hometask1.shop.Product;
import com.hometask1.shop.Shop;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {


        List<Product> product = List.of(
                new Product("IPhone", 1100, Category.ELECTRONIC, true
                        , new Shop(1, "Minsk", "Lenina 7", "+375298889900")
                        , new Manufacturer("apple", "USA")),
                new Product("IPad", 600, Category.ELECTRONIC, false
                        , new Shop(2, "Minsk", "Sovetskaja 34", "+375339092121")
                        , new Manufacturer("apple", "USA")),
                new Product("sneakers", 100, Category.SHOES, false
                        , new Shop(3, "Gomel", "Chkalovo 13", "+375445456655")
                        , new Manufacturer("Adidas", "Germany")),
                new Product("blouse", 50, Category.CLOTHES, true
                        , new Shop(4, "Mogilev", "Gercina 22", "+375298765432")
                        , new Manufacturer("tvoyo", "China")),
                new Product("t-shirt", 100, Category.SHOES, false
                        , new Shop(3, "Gomel", "Chkalovo 13", "+375445456655")
                        , new Manufacturer("Nike", "China"))

        );
        //1) определить самый дорогой и дешевый товар
        Double vMin = product.stream()
                .mapToDouble(Product::getCost)
                .min()
                .getAsDouble();
//        System.out.println(vMin);

        Double vMax = product.stream()
                .mapToDouble(Product::getCost)
                .max()
                .getAsDouble();
//        System.out.println(vMax);

        //2) найти все товары которые возможно доставить до покупателя
        List<Product> collect = product.stream()
                .filter(Product::isDelivery)
                .toList();
//        System.out.println(collect);

        //3) посчитать среднюю стоимость товара указанной категории
        double avrage = product.stream()
                .filter(product1 -> product1.getCategory() == Category.ELECTRONIC)
                .mapToDouble(Product::getCost)
                .average()
                .getAsDouble();
//        System.out.println(avrage);

        //4) найти все товары определенного производителя
        List<Product> collect1 = product.stream()
                .filter(product1 -> "apple".equals(product1.getManufacturer().getName()))
                .toList();
//        System.out.println(collect1);

        //5) найти всех названия производителей указанной страны
        List<String> nameManufacturer = product.stream()
                .filter(product1 -> "China".equals(product1.getManufacturer().getCountry()))
                .map(prod -> prod.getManufacturer().getName())
                .toList();
//        System.out.println(nameManufacturer);

        //6) найти все магазины конкретного города
        List<Integer> shopInCity = product.stream()
                .filter(prod -> "Minsk".equals(prod.getShop().getCity()))
                .map(prod -> prod.getShop().getNumber())
                .toList();
//        System.out.println(shopInCity);

        //7) найти адрес магазина по указанному номеру телефона
        List<String> adressToPhone = product.stream()
                .filter(prod -> "+375298889900".equals(prod.getShop().getPhoneNumber()))
                .map(product1 -> product1.getShop().getAddress())
                .toList();
//        System.out.println(adressToPhone);

        //8) все товары указанного номера магазина
        List<String> list = product.stream()
                .filter(prod -> prod.getShop().getNumber() == 3)
                .map(Product::getName)
                .toList();
//        System.out.println(list);

        //9) составить map где ключ это номер магазина, а значение - это номер телефона данного магазина
        Map<Integer, String> collect2 = product.stream()
                .collect(Collectors.toMap(product1 -> product1.getShop().getNumber()
                        , product2 -> product2.getShop().getPhoneNumber()
                        ,(key1, key2)-> key1));
//        System.out.println(collect2);

        //10) узнать все ли товары указанной категории можно доставить до покупателя
        boolean b = product.stream()
                .filter(product1 -> product1.getCategory() == Category.ELECTRONIC)
                .allMatch(Product::isDelivery);
//        System.out.println(b);

        //11) посчитать количество магазинов
        long numberOfStore = product.stream()
                .map(product1 -> product1.getShop().getNumber())
                .distinct()
                .count();
//        System.out.println(numberOfStore);

        //12) вывести товары отсортированные по стоимости (от большего к меньшему)
        List<String> list1 = product.stream()
                .sorted((product1, product2) -> (int) (product2.getCost() - product1.getCost()))
                .map(product1 -> product1.getName())
                .toList();
//        System.out.println(list1);


    }
}

