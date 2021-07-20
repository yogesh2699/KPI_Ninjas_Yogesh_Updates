package Assignment;

import java.util.Scanner;

public class Assignment2 {
    public static int map()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] key = new String[n];
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            key[i] = sc.next();
        }
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        int index = -1;
        for (int i = 0;i<n;i++)
        {
            if(key[i].equals(s))
            {
                index = i;
                break;
            }
        }
        if(index == -1)
            return index;
        else
            return arr[index];
    }

    public static void main(String[] args) {
        System.out.println(map());
    }
}
