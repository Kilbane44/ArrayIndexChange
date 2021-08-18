import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        SomeClass sc = new SomeClass();
        Scanner in = new Scanner(System.in);

        sc.ChangeWord(9, in.nextLine());
        sc.ChangeWord(8, "WEEEE");
        sc.Print();

        System.out.println(2+4);
    }
}
