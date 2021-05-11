package bai8_clean_code.thuchanh.tach_bien;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz=number%3==0;
        boolean isBuzz=number%5==0;
        if (isBuzz && isFizz){
            return "FizzBuzz";
        }else if (isFizz){
            return "Fizz";
        }
        return "Buzz";
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz=new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(15));
    }
}
