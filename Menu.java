package ProblemaComPOO;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Triangulo x,y;
        double areaX,areaY;
        Scanner sc = new Scanner(System.in);
        
        // variáveis para o loop
        int continuar = 1;
        String confirmar;        

        x = new Triangulo();
        y = new Triangulo();
        
        // cria loop para o funcionamento do código

        do {
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

            // pergunta se usuário deseja continuar com a execução do programa
            sc.nextLine();
            System.out.print("\nDeseja continuar? (S/N): ");
            confirmar = sc.nextLine();
            if(confirmar.equals("n") || confirmar.equals("N")) {
                continuar = 0;
            }          

        }while(continuar == 1);
        sc.close();
    }

}
