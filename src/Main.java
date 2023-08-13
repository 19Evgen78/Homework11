import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;

        checkYear(year);
    }

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "год - високосный год");
        } else {
            System.out.println(year + "год - невисокосный год");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int typeOS = 1;
        int currentYear = LocalDate.now().getYear();
        printVersion(typeOS, currentYear);
    }

    public static void printVersion(int typeOS, int currentYear) {
        if (typeOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (typeOS == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (typeOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


    }

    public static void task3() {
        System.out.println("Задача 3");


        int deliveryDistance = 95;
        int numberDeliveryDay = 1;
        calculateDeliveryDays(deliveryDistance, numberDeliveryDay);
        String strOut = calculateDeliveryDays(deliveryDistance,numberDeliveryDay);
    }

    public static String calculateDeliveryDays(int deliveryDistance, int numberDeliveryDay) {


        if (deliveryDistance <= 20) {
            //System.out.println()
        return "Потребуется дней : " + numberDeliveryDay;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            //System.out.println()
        return "Потребуется лней : " + (numberDeliveryDay + 1);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            //System.out.println()
        return "Потребуется дней : " + (numberDeliveryDay + 2);
        } else if (deliveryDistance > 100) {
            //System.out.println()
        return "Доставки нет";
        }
        String strOut = null;
        return null;
    }
}