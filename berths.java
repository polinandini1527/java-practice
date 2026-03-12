import java.util.Scanner;
class Berths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seat number (1-72): ");
        int seat = sc.nextInt();
        int position = seat % 8;
        switch (position) {
            case 1,4:
                System.out.println("Lower Berth");
                break;
            case 2,5:
                System.out.println("Middle Berth");
                break;
            case 3,6:
                System.out.println("Upper Berth");
                break;
            case 7:
                System.out.println("Side Lower");
                break;
            case 0:
                System.out.println("Side Upper");
                break;
            default:
                System.out.println("Invalid seat number");
        }
    }
}
