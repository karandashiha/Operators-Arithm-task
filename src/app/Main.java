package app;

public class Main {

    static String name;
    static int quota;
    static double price;
    static  double salesAmount;
    static double avgSum;
    static int days;

    public static void main(String[] args) {

        name = "Oranges";
        quota = 158;
        price = 2.99;
        days = 3;

        salesAmount = quota * price;
        System.out.println("Product: " + name + ", sales EUR " + salesAmount);

        avgSum = salesAmount / days;
        System.out.println("Product: " + name + ", sales by day EUR " + avgSum);

        name = "Apples";
        quota = 117;
        price = 1.95;
        days = 7;

        salesAmount = quota * price;
        System.out.println("Product: " + name + ", sales EUR " + salesAmount);

        avgSum = salesAmount / days;
        System.out.println("Product: " + name + ", sales by day EUR " + avgSum);

    }
}
