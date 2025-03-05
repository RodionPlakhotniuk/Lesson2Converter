package app;

public class Main {

    private static final double CONV_M = 1.60934;

    public static void main(String[] args) {
        double miles = 15;

        System.out.println("Привіт, я Convi бот для конвертації одиниць виміру");
        System.out.printf("%d миль = %f кілометри\n", (int) miles, convMilesToKilometrs(miles));

    }

    private static double convMilesToKilometrs(double miles) {
        return miles * CONV_M;
    }
}
