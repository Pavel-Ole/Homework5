package ru.netology.sqr.Home;

public class SQRService {
    public int calculatorSq(int min, int max) {

        // программируем счетчик:
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min & i * i <= max) {
                x++;
            }
        }

        // возвращаем сумму количества результатов в диапозоне:
        return x;
    }
}