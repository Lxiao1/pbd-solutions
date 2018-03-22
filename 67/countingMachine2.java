import java.util.Scanner;

public class countingMachine2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Count from: ");
        int countFrom = sc.nextInt();
        System.out.println("");
        System.out.print("Count to: ");
        int countTo = sc.nextInt();
        System.out.println("");
        System.out.print("Count by: ");
        int countBy = sc.nextInt();
        System.out.println("");
        for(int x = countFrom ; x <= countTo ; x = x + countBy){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
