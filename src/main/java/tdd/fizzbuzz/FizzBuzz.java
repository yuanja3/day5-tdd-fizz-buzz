package tdd.fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String BUZZ_WHIZZ = "BuzzWhizz";
    public static final String FIZZ_WHIZZ = "FizzWhizz";
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public String countOff(int number) {

        boolean isCommonMultiple3And5 = number % 3 == 0 && number % 5 == 0;
        boolean isMultiple3= number%3==0 ;
        boolean isMultiple5= number%5==0;
        boolean isMultiple7= number%7==0;
        boolean isCommonMultiple3And7= number % 3 == 0 && number % 7 == 0;
        boolean isCommonMultiple5And7= number % 7 == 0 && number % 5 == 0;
        boolean isCommonMultiple3And5And7= number % 3 == 0 && number % 5 == 0&& number % 7 == 0;
        if (isCommonMultiple3And5And7) {
            return FIZZ_BUZZ_WHIZZ;
        }
        else if(isCommonMultiple3And5){
            return FIZZ_BUZZ;
        }
        else if (isCommonMultiple5And7) {
            return BUZZ_WHIZZ;
        }
        else if (isCommonMultiple3And7) {
            return FIZZ_WHIZZ;
        }
        else if (isMultiple3){
            return FIZZ;
        }
        else if(isMultiple5){
            return BUZZ;
        } else if (isMultiple7) {
            return WHIZZ;
        }
        return String.valueOf(number);
    }
}
