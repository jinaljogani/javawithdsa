// a writing a simple java program which can perform basic arithamatic operation

import java.util.*;

public class calculator{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans=0;
        while(true){
            System.out.println("Enter the operator:");
            char op= in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                //taking two no to operation perform
                System.out.println("Enter the two number:");
                int a = in.nextInt();
                int b= in.nextInt();

                
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);


        }
        
    }

}