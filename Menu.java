package ProblemaComPOO;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Triangulo x;
        double areaX;
        Scanner sc = new Scanner(System.in);
        int i=0, ver=0, op, opver=0;
        
        x = new Triangulo();

        while(ver==0) {
            System.out.println("Digite as medidas do triangulo X: ");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();

            areaX = x.areaTriangulo();
            
            if (i==0) { //primeiro triangulo sempre sera o maior digitado
                areaMaior = areaX;
                maiorTriangulo = i+1;
            }
            else if(areaX>maiorTriangulo) { //verifica se o triangulo digitado eh maior que o maior triangulo atualmente
                areaMaior = areaX;
                maiorTriangulo = i+1;
            }

            while(opver==0) { //loop de verificacao
                System.out.println("Digite 1 para calular a area de um novo triangulo ou 0 para sair: ");
                op = sc.nextInt();
                if (op==0) {
                    ver++;
                    opver++;
                }
                else if (op==1) {
                    opver++;
                }
                else {
                    System.out.println("Operaao invalida, tente novamente.");
                }
            }
            opver = 0;
            i++;
        }
        
        System.out.println("\nMaior triangulo " + maiorTriangulo + ", área: " + areaMaior);

        sc.close();
    }

}
