import java.util.Scanner;

public class ArrayRotation {
    public static void reverse(int start, int end, int[] arr){
        int i = start, j = end, temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        if(b>n){
            b = b%n;
        }
        reverse(0, n-1, arr);
        reverse(0,b-1,arr);
        reverse(b,n-1,arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
