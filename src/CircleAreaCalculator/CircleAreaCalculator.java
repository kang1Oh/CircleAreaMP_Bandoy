/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CircleAreaCalculator;
import java.util.Scanner;
/**
 *
 * @author Janey
 */
public class CircleAreaCalculator {
    public static void circleDiagram(double area){
        System.out.println("      x  x");
        System.out.println("   x        x");
        System.out.println("  x          x\t Area of this Circle:");
        System.out.println("  x          x\t\t"+area);
        System.out.println("   x        x");
        System.out.println("      x  x\n\n");
    }
    public static double circleArea(double radius){
        double pi = 3.1415, area = 0.0;
        area = pi*radius*radius;
        return area;
    }
    public static void main(String[] args){
        //variables & imports
        double pi, radius = 1, area = 0.0;
        Scanner in = new Scanner(System.in);
        
        //==============================================
        //Code proper
        System.out.println("   XXxxxxx AreaOfACircle.com xxxxxXX\n");
        System.out.print("\t [1] Radius\n\t [2] Diameter\n\t Your choice: ");
        int opt = in.nextInt();
        
        if(opt == 1){
            System.out.print("\t Enter Radius: ");
            radius = in.nextDouble();
            area = circleArea(radius);
        }else if(opt == 2){
            System.out.print("\t Enter Diameter: ");
            radius = in.nextDouble();
            area = circleArea(radius/2.0);
        }
        
        System.out.println("");
        circleDiagram(area);
        System.out.println("      Dev: Jane Rose M. Bandoy\n\t  BSIT - BTM 2B");
        
        
        
    }
}
