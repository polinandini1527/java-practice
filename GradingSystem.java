import java.util.Scanner;
class GradingSystem{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
switch(marks)
{
	case 100 :System.out.println("A+ Grade");
	           break;
	case 85,86,87,88,89,90,91,92,93,94,95,96,97,98,99:System.out.println("A Grade");
	           break;		
	case 65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84:System.out.println("B Grade");
	           break;	
    case 40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64:System.out.println("C Grade");
	           break;	
    case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39:System.out.println("Fail");
	           break;
    default:System.out.println("invalid");
}
}
}	
	
