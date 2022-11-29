package MarketMethods;

import java.util.Scanner;

public class ScannerMethod {
    public static String requireString(String title){
        Scanner sc=new Scanner(System.in);
        System.out.println(title);
        String answer=sc.nextLine();
        return answer;
    }
    public static double requireDouble(String title){
        Scanner sc=new Scanner(System.in);
        System.out.println(title);
     Double answer=sc.nextDouble();
        return answer;
    }
     public static int requireInt(String title){
        Scanner sc=new Scanner(System.in);
        System.out.println(title);
     int answer=sc.nextInt();
        return answer;
}
}
