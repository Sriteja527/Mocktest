import java.util.*;
public class Fibonocii{
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter the number:");
      int n = sc.nextInt();
      int a = 0, b = 1;
      int c;
      for(int i=1;i<=n;i++){
        System.out.println(a);
        c = a + b;
        a = b;
        b = c;
      }

    }
    public static void main(String[] args){
        Fibonocii f = new Fibonocii();
        f.input();
    }
}