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
    @Test
    void should_return_fizzbuzz_when_countOff_common_multiple_3_5(){
        //Given
        int number=15;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //When
        String result=fizzBuzz.countOff(number);
        //Then
        assertEquals("FizzBuzz",result);
    }
    @Test
    void should_return_fizzbuzz_when_countOff_common_multiple_7(){
        //Given
        int number=14;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //When
        String result=fizzBuzz.countOff(number);
        //Then
        assertEquals("Whizz",result);
    }
    @Test
    void should_return_fizzbuzz_when_countOff_common_multiple_3_7(){
        //Given
        int number=21;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //When
        String result=fizzBuzz.countOff(number);
        //Then
        assertEquals("FizzWhizz",result);
    }
    @Test
    void should_return_fizzbuzz_when_countOff_common_multiple_5_7(){
        //Given
        int number=35;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //When
        String result=fizzBuzz.countOff(number);
        //Then
        assertEquals("BuzzWhizz",result);
    }
    @Test
    void should_return_fizzbuzz_when_countOff_common_multiple_3_5_7(){
        //Given
        int number=105;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //When
        String result=fizzBuzz.countOff(number);
        //Then
        assertEquals("FizzBuzzWhizz",result);
    }
}
