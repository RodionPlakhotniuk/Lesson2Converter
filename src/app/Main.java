package app;

import java.util.Scanner;

public class Main {

    private static final double CONV_M = 1.60934;
    private static final double CONV_K = 0.621371;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.printf("Привіт, я Convi бот для конвертації одиниць виміру\n"
                + "Обери, що саме треба конвертувати і я тобі в цьому допоможу\n"
                + "Зроби свій вибір:\n"
                + "1. конвертувати милі в кілометри\n"
                + "2. конвертувати кілометри в милі\n");


        int usersNum = sc.nextInt();


        if (usersNum == 1) {
            System.out.println("Веди кількість миль, які треба перевести в кілометри\n" +
                    "* числа треба водити в такому форматі 5 або 5.5");
            double miles = sc.nextDouble();
            System.out.println(miles + " миль = " + convMilesToKilometrs(miles) + " кілометрів");
        } else if (usersNum == 2) {
            System.out.println("Веди кількість кілометрів, які треба перевести в милі" +
                    "* числа треба водити в такому форматі 5 або 5.5");
            double kilometers = sc.nextDouble();
            System.out.println(kilometers + " кілометри = " + convKilometersToMiles(kilometers) + " миль");
        } else
            System.out.println("Перезавантаж програму, та обери із можливого функціоналу 1 або 2");

        sc.close();

    }

    private static double convMilesToKilometrs(double miles) {
        return miles * CONV_M;
    }

    private static double convKilometersToMiles(double kilometers) {
        return kilometers * CONV_K;
    }
}
