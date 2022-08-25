import java.util.Scanner;
public class CmdLineInvalidInt{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number : ");
        int s= input.nextInt();
        int r= input.nextInt();
        int sum=s+r;
        System.out.println(" sum is " + sum)
    }
}
