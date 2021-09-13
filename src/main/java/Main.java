import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?");
        String num1 = scanner.nextLine();
        System.out.println("What is the second number?");
        String num2 = scanner.nextLine();
        int x =Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        System.out.println(num1+" + "+num2+" = "+(x+y)+"\n"+num1+" - "+num2+" = "+(x-y)+
                            "\n"+num1+" * "+num2+" = "+(x*y)+"\n"+num1+" / "+num2+" = "+(x/y));

    }
}
