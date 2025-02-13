import java.util.*;
    public class reverse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number you want to reverse:");
            int num=sc.nextInt();

            int ans=0;
            while(num>0){
                int rem=num%10;
                num/=10;
                
                ans= ans*10+rem;

            }
            System.out.println("reverse of given number is: "+ ans);
        }
}
