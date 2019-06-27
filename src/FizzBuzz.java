public class FizzBuzz {

    public String isDivisibleBy(int a) {
        if ( a % 15 == 0){
            return("Fizzbuzz");
        } else if (a % 5 == 0){
            return ("Buzz");
        } else if (a % 3 == 0){
            return("Fizz");
        }
        return String.valueOf(a);
    }
}