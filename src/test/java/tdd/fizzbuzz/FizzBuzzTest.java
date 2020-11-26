package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private final int multiple_of_3 = 3;
    private final int multiple_of_5 = 5;
    private final int multiple_of_7 = 7;
    private final int multiple_of_3_and_5 = multiple_of_3 * multiple_of_5;
    private final int multiple_of_3_and_7 = multiple_of_3 * multiple_of_7;

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

        int order = multiple_of_3;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("Fizz", actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_5() {
        //given

        int order = multiple_of_5;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("Buzz", actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_7() {
        //given

        int order = multiple_of_7;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("Whizz", actual);
    }

    @Test
    public void should_return_Buzz_when_count_off_given_order_number_multiple_of_3_and_5() {
        //given

        int order = multiple_of_3_and_5;

        FizzBuzz fizzbuzz = new FizzBuzz();

        //when

        String actual = fizzbuzz.countOff(order);

        //then

        assertEquals("FizzBuzz", actual);
    }

}
