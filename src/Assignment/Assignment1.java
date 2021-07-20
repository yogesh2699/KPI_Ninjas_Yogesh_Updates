package Assignment;

import java.util.Scanner;

public class Assignment1 {
    public static int[] getSum()
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        int n = sc.nextInt();
        int even_sum = 0;
        int odd_sum = 0;
        for(int i =1;i<=n;i++)
        {
            if(i%2 == 0)
            {
                even_sum = even_sum + i;
            }else
                odd_sum = odd_sum + i;
        }
        arr[0] = even_sum;
        arr[1] = odd_sum;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = getSum();
        System.out.println(arr[0] + " "+ arr[1]);
    }
}
