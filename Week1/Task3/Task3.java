import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String FullName;
        int Age;
        String CollegeName;
        String Branch;
        String City;
        System.out.println("Enter your Full Name:");
        FullName=in.nextLine();
        System.out.println("Enter your Age:");
        Age=in.nextInt();
        System.out.println("Enter your college name");
        CollegeName=in.next();
        System.out.println("Enter Your Branch");
        Branch=in.next();
        System.out.println("Enter Your City");
        City=in.next();
        System.out.println("Full Name:"+ FullName);
        System.out.println("Age:"+Age);
        System.out.println("College Name:"+ CollegeName);
        System.out.println("Branch:"+Branch);
        System.out.println("City:"+City);

    }
    
}
