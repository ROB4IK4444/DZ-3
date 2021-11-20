package com.company;

public class Main {

    public static void main(String[] args) {



        int clientOS = 0;

        {
            if (clientOS == 0) {
                System.out.println("«Установите версию приложения для iOS по ссылке»");
            } else  {
                System.out.println("«Установите версию приложения для Android по ссылке»");
            }

        }
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке» ");
        } else  {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        }
        if (clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        } else  {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
        }



        int year = 2021;

          if ((year % 4 == 0) && year % 100 != 0){
              System.out.println(year + " год является високосным!");}

          else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
              System.out.println(year + " год является високосным!");}

          else {
              System.out.println(year + " год не является високосным!");
          }

        int deliveryDistance = 95;
         if (deliveryDistance <= 20 && deliveryDistance > 0){
             System.out.println("Потребуется дней: " + 1);}
         else if (deliveryDistance > 20 && deliveryDistance <= 60){
             System.out.println("Потребуется дней: " + 2);}
         else if (deliveryDistance > 60 && deliveryDistance <= 100){
             System.out.println("Потребуется дней: " + 3);}
         else {
             System.out.println("Извените доставка в данный район не доступна!");}


         int monthNumber = 12;
         switch (monthNumber){
             case 1: System.out.println("Месяц январь принодлежит зимнему сезону!");
                 break;
             case 2: System.out.println("Месяц февраль принодлежит зимнему сезону!");
                 break;
             case 3: System.out.println("Месяц март принодлежит весеннему сезону!");
                 break;
             case 4: System.out.println("Месяц апрель принодлежит весенниму сезону!");
                 break;
             case 5: System.out.println("Месяц май принодлежит весенниму сезону!");
                 break;
             case 6: System.out.println("Месяц июнь принодлежит летниму сезону!");
                 break;
             case 7: System.out.println("Месяц июль принодлежит летниму сезону!");
                 break;
             case 8: System.out.println("Месяц август принодлежит летниму сезону!");
                 break;
             case 9: System.out.println("Месяц сентябрь принодлежит осеннему сезону!");
                 break;
             case 10: System.out.println("Месяц октябрь принодлежит осеннему сезону!");
                 break;
             case 11: System.out.println("Месяц ноябрь принодлежит осеннему сезону!");
                 break;
             case 12: System.out.println("Месяц декабрь принодлежит зимнему сезону!");
                 break;
             default: System.out.println("Такого месяца не существует!");
                 break;
         }


    }


}

