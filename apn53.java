import java.util.Scanner;
public class apn53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=10;i++ ){
            System.out.println(i*n);
        }
    }
}
