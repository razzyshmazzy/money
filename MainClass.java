import java.util.*;
public class Flooring
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Profits Made This Month: ");
        double total = scan.nextDouble();
        //
        int joe = (int)(total*.3);
        int gav = (int)(total*.3);
        int alex = (int)(total*.3);
        int gay = (int)(total*.1);
        //
        double val1 = total*.3;
        double val2 = total*.1;
        //
        double num1 = val1 - (double)joe;
        double num2 = val1 - (double)gav;
        double num3 = val1 - (double)alex;
        double num4 = val2 - (double)gay;
        //
        double community_money = (int)((num1+num2+num3+num4)*100+.5)/100.0;
        System.out.println("Joseph = $"+joe);
        System.out.println("Gavin = $"+gav);
        System.out.println("Alex = $"+alex);
        System.out.println("Gaymo = $"+gay);
        System.out.println("Community Money = $"+community_money);
        //

    }
}
