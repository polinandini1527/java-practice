import java.util.*;
public class Binarysearch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i=0; i<n; i++) a[i] = sc.nextInt();

		int key = sc.nextInt();
		int l = 0, h = n-1, m;

		while(l <= h) {
			m = (l + h) / 2;

			if(a[m] == key) {
				System.out.println("YES");
				return;
			}
			else if(a[m] < key)
				l = m + 1;
            else 
                h = m - 1;
		}
		System.out.println("NO");
	}
}
