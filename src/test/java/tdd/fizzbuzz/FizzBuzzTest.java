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

    @Test
    public void should_return_Fizz_when_count_off_given_order_number_multiple_of_3() {
        //given

        int order = 3;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("Fizz", actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_5() {
        //given

        int order = 5;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("Buzz", actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_7() {
        //given

        int order = 7;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("Whizz", actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_3_and_5() {
        //given

        int order = 15;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_3_and_7() {
        //given

        int order = 21;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("FizzWhizz", actual);
    }
}
