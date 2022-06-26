package ru.netology.sqr.Home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void testCalculatorSqMinMax() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int min = 400;
        int max = 700;
        int expected = 7;

        // вызываем целевой метод:
        int actual = service.calculatorSq(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @Test
    public void testCalculatorSqMinEqualsMax() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int min = 700;
        int max = 700;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.calculatorSq(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @Test
    public void testCalculatorSqMinMoreMax() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int min = 900;
        int max = 700;
        int expected = 0;

        // вызываем целевой метод:
        int actual = service.calculatorSq(min, max);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
}

