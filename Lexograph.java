import java.util.Scanner;

public class Lexograph {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        l(s1, s2);
    }

    public static void  l(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.equals(s2))
            System.out.println(0);
        if(s1.compareTo(s2) > 0)
            System.out.println(1);
        if(s1.compareTo(s2) < 0)
            System.out.println(-1);

    }
}
