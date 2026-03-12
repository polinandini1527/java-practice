import java.util.*;
public class Selectionsort
{
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int min;

		for(int i=0; i<n; i++) a[i] = sc.nextInt();

        // Selection Sort Logic
        for(int i=0; i<n-1; i++) {
            min = i;
            
            for(int j=i+1; j<n; j++)
                if(a[j] < a[min])
                    min = j;
            
            if(min != i)
                swap(a, min, i);
        }
		
		for(int i=0; i<n; i++) System.out.print(a[i] + " ");
	}
}
