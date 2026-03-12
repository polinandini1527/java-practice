import java.util.*;
public class Insertionsort
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int temp, j;

		for(int i=0; i<n; i++) a[i] = sc.nextInt();

        // Insertion Sort Logic
        for(int i=1; i<n; i++) {
            temp = a[i];
            j= i-1;
            
            while(j>=0 && temp < a[j]) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
		
		for(int i=0; i<n; i++) System.out.print(a[i] + " ");
	}
}
