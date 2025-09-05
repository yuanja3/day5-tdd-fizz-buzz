package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_normal_number_when_countOff_normal_number(){
        //Given
        int number=1;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //When
        String result=fizzBuzz.countOff(number);
        //Then
        assertEquals(String.valueOf(number),result);
    }

    @Test
    void should_return_fizz_when_countOff_multiple_3(){
        //Given
        int number=3;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //When
        String result=fizzBuzz.countOff(number);
        //Then
        assertEquals("Fizz",result);
    }
    @Test
    void should_return_buzz_when_countOff_multiple_5(){
        //Given
        int number=5;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //When
        String result=fizzBuzz.countOff(number);
        //Then
        assertEquals("Buzz",result);
    }
}
