public class task5 {
    public static void main(String[] args){
        factorial(5);
        System.out.println();
        factorial(10000);
    }
    public static void factorial(int num){
        int result = 1;
        for (int i = num; i >= 1; i--)
        {
            result *= i;
        }
        if (result != 0)
        {
            System.out.print("Factorial of your number is ");
            System.out.println(result);
        }
        else
        {
            System.out.println("Something went wrong :(");
        }
    }
}
