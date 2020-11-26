package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_count_off_given_order_number_1() {
        //given

        int order = 1;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("1", actual);
    }
}
