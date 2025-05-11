package ProblemaComPOO;

public class Triangulo {

    public double a;
    public double b;
    public double c;

    public double areaTriangulo(){
        double p;
        p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public double perimetroTriangulo(){
        double perimetro;
        perimetro = a + b + c;
        return perimetro;
    }
}


