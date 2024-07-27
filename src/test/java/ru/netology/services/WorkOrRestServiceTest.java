package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkOrRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "test_data.csv")

    public void testWithParameters(int income, int expenses, int threshold, int expected) {
        WorkOrRestService service = new WorkOrRestService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
