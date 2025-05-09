package ProblemaComPOO;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Triangulo x,y;
        double areaX,areaY;
        Scanner sc = new Scanner(System.in);
        
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        areaX = x.areaTriangulo();
        areaY= y.areaTriangulo();
        
        System.out.printf("Area do triangula X: %.2f",areaX);
        System.out.printf("\nArea do triangula Y: %.2f",areaY);
        System.out.println("\nMaior área: " + ((areaX > areaY) ? 'X':'Y'));

        sc.close();
    }

}
