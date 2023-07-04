import java.util.*;
public class Number{
Scanner sc = new Scanner(System.in);
void input(){
    System.out.println("enter the number:");
    int n = sc.nextInt();
    if(n > 0){
        System.out.println("positive number:");
    }
    else{
        if(n < 0){
            System.out.println("It is negative number:");
        }
        else{
            if(n == 0){
                System.out.println("The number is zero:");
            }
        }
    }
}
public static void main(String[] args){
    Number n = new Number();
    n.input();
}
}