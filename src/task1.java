public class task1 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
            sum += arr[i];
        }
        System.out.println();
        float median = (float) sum/arr.length;
        System.out.println("Сумма элементов: ");
        System.out.println(sum);
        System.out.println("Среднее арифметическое элементов: ");
        System.out.println(median);
    }
}
