import java.util.Scanner;
class Agedetector{
public static void main(String args[])
{
    Scanner pc=new Scanner(System.in);
    System.out.println("enter the minimum age limit(X):");
    int X=pc.nextInt();
    System.out.println("enter the maximum age limit(Y):");
    int Y=pc.nextInt();
    System.out.println("enter your age:");
    int age=pc.nextInt();
    if(age>=X&&age<Y)
    {
        System.out.println("valid age!");
    }
    else{
        System.out.println("invaliid age!");
    }
    }
}
