package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"'range200300',3,200,300",
            "'range300400',2,300,400",
            "'range400500',2,400,500"})

    public void shouldCountCalc(String testName, int expected, int min, int max) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.countCalc(min, max);

        assertEquals(expected, actual);

    }
}