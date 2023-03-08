package dev.duclervil.tests;

import dev.duclervil.app.AwesomeCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void basic_addition(){
        double results = AwesomeCalculator.add(2,3);
        Assertions.assertEquals(5, results);
    }

    @Test
    void negative_addition(){
        double result = AwesomeCalculator.add(-5,-5);
        Assertions.assertEquals(-10,result);;
    }

    @Test
    void get_environ_variable(){
        System.out.println(System.getenv("GREETING"));
    }

}
