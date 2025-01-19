import java.util.Scanner;
import java.util.Random;
class player{
    String name;
}
public class Guessthenumber {
    public static void game(int num1 ,int num2 ,int num3,int n ){
        if(num1==n){
            if(num2==n){
                if (num3 == n){
                    System.out.println("All are the winner so there is a draw");
                }
                else{
                    System.out.println("Both player one and two are winner");
                }
            }
            else {
                if (num3 == n){
                    System.out.println("Both the player one and three are winner");
                }
                else {
                    System.out.println("Player one is the winner");
                }
            }
        } else if (num2 == n) {
                if(num3==n) {

                    System.out.println("Both player two and three are winner");
                }else {
                        System.out.println("Player two is the winner");
                    }

        } else if (num3==n) {
            System.out.println("Player three is the winner");
        }
        else{
            System.out.println("No one was able to guess the right answer so there is a draw!!!!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();
        System.out.print("Enter the name of first player :");
        p1.name = sc.nextLine();
        System.out.print("Enter the name of second player :");
        p2.name = sc.nextLine();
        System.out.print("Enter the name of third player :");
        p3.name = sc.nextLine();
        Random random = new Random();
        int n = random.nextInt(10)+1;
        System.out.println(n);
        System.out.print("First player enter the number:");
        int num1 = sc.nextInt();
        System.out.print("Second player enter the number:");
        int num2 = sc.nextInt();
        System.out.print("Third player enter the number:");
        int num3 = sc.nextInt();
        game(num1,num2,num3,n);
    }
}
