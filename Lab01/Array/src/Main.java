import java.util.Arrays;
import java.util.Scanner;

class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        float avg;
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.toString(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        avg = (float)sum/(float)n;
        System.out.println("\nSum is " + sum + " and average is " + avg);
    }
}