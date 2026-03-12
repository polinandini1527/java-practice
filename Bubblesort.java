import java.util.*;
public class Bubblesort
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

		for(int i=0; i<n; i++) a[i] = sc.nextInt();

        // Bubble Sort Logic
        for(int i=0; i<n-1; i++)
            for(int j=0; j<n-i-1; j++)
                if(a[j] > a[j+1])
                    swap(a, j, j+1);
		
		for(int i=0; i<n; i++) System.out.print(a[i] + " ");
	}
}

