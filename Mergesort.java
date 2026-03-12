import java.util.*;
public class Mergesort
{
    static int[] org;
    static int[] s;
    
    public static void merge(int l, int m, int h) {
        int l1, l2, i;
        
        for(l1=l, l2=m+1, i=l; l1<=m && l2<=h; i++) {
            if(org[l1] < org[l2])
                s[i] = org[l1++];
            else
                s[i] = org[l2++];
        }
        
        while(l1 <= m) s[i++] = org[l1++];
            
        while(l2 <= h) s[i++] = org[l2++];
        
        for(int k=l; k<=h; k++) org[k] = s[k];
    }
    
    public static void mergeSort(int low, int high) {
        int mid;
        
        if(low < high) {
            mid = (low + high) / 2;
            mergeSort(low, mid);
            mergeSort(mid+1, high);
            merge(low, mid, high);
        }
        else
            return;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		org = new int[n];
		s = new int[n];
		
        for(int i=0; i<n; i++) org[i] = sc.nextInt();
        
        mergeSort(0, n-1);
        
        for(int i=0; i<n; i++) System.out.print(org[i] + " ");
	}
}
