package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class TestVacationPlan {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testCorrectVacationData(int expected, int income, int expenses, int threshold) {
        VacationPlan service = new VacationPlan();

        int actual = service.calcVacationPlan(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
