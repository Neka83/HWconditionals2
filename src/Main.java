//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Задача 1
    int clientOS = 0;
    if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
    // Задача 2
    int clientOSys = 0;
    int clientDeviceYear = 2015;

    if (clientOSys == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientOSys == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOSys == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    } else if (clientOSys == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    // Задача 3
     int year = 2021;

    if (year <= 1584) {
        System.out.println("Год должен быть больше 1584");
    } else {
        if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
            System.out.println(year + " Год яляется високосным");
    } else {
            System.out.println(year + " Год не является високосным");
    }
    // Задача 4
     int deliveryDistance = 95;
     int days = 0;

     if (deliveryDistance > 100) {
         System.out.println("Доставка до этого адреса не доступна");
     } else {
         days = 1;
         if (deliveryDistance > 20) {
             days = days + 1;
         }
         if (deliveryDistance > 60) {
             days = days + 1;
             System.out.println("Потребуется дней: " + days);
         }
     // Задача 5

     int monthNumber = 12;
     switch (monthNumber) {
             case 12:
             case 1:
             case 2:
                 System.out.println("Зима");
                 break;
             case 3:
             case 4:
             case 5:
                 System.out.println("Весна");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Лето");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("Осень");
                 break;
             default:
                 System.out.println("Такого месяца нет");
     }

     }
    }
     }
}







