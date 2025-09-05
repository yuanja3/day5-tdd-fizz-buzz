package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String countOff(int number) {
        boolean isCommonMultiple3And5 = number % 3 == 0 && number % 5 == 0;
        boolean isMultiple3= number%3==0 ;
        boolean isMultiple5= number%5==0;
        if(isCommonMultiple3And5){
            return FIZZ_BUZZ;
        }
        else if (isMultiple3){
            return FIZZ;
        }
        else if(isMultiple5){
            return BUZZ;
        }
        return String.valueOf(number);
    }
}
