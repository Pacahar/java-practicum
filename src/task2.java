import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        while (true){
            System.out.println("Реализация на каком цикле вас интересует?\n 1) For\n 2) While\n 3) Do while");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            System.out.println("Введите кол-во элементов массива");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum = 0, max = 0, min = 0, i = 0;
            switch (choice) {
                case 1:
                    for (; i < n; i++){
                        int cur = scanner.nextInt();
                        arr[i] = cur;
                        sum += cur;
                        if (i == 0){
                            max = min = cur;
                        }
                        else{
                            max = Math.max(cur, max);
                            min = Math.min(cur, min);
                        }
                    }
                    break;
                case 2:
                    while (i < n){
                        int cur = scanner.nextInt();
                        arr[i] = cur;
                        sum += cur;
                        if (i == 0){
                            max = min = cur;
                        }
                        else{
                            max = Math.max(cur, max);
                            min = Math.min(cur, min);
                        }
                        i++;
                    }
                    break;
                case 3:
                    do{
                        int cur = scanner.nextInt();
                        arr[i] = cur;
                        sum += cur;
                        if (i == 0){
                            max = min = cur;
                        }
                        else{
                            max = Math.max(cur, max);
                            min = Math.min(cur, min);
                        }
                        i++;
                    } while (i < n);
                    break;
            }
            print(sum, max, min);
        }

    }
    public static void print(int sum, int max, int min){
        System.out.print("Сумма: ");
        System.out.println(sum);
        System.out.print("Максимальный элемент: ");
        System.out.println(max);
        System.out.print("Минимальный элемент: ");
        System.out.println(min);
    }
}
