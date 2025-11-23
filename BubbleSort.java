package dsa;

import java.util.Scanner;
public class BubbleSort
{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements to sort: ");
        int n = sc.nextInt();

        int A[] = new int[n];
        System.out.print("Enter elements to sort: ");
        for(int i =0; i<n; i++)
        {
            A[i] = sc.nextInt();
        }

        int temp = 0;
        for(int k =0; k<n; k++)
        {
            for(int j = k+1; j<n; j++)
            {
                if(A[k] > A[j])            //For Descending order condition -> if(A[k] < A[j])
                {
                    temp = A[k];
                    A[k] = A[j];
                    A[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int i =0; i<n; i++)
        {
            System.out.println(A[i]);
        }
    }
}
