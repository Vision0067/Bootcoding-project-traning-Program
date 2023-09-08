import java.lang.System;
import java.util.Scanner;
class Scanjava {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter username: ");
        String name=s1.nextLine();
        System.out.println(" username : "+ name);
        
         System.out.println("enter age : ");
        int age=s1.nextInt();
        System.out.println(" Age is: "+ age);
        
    }
}
