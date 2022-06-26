package ru.netology.sqr.Home;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int x = service.calculatorSq(0, 0);
        System.out.println(x);
    }
}
