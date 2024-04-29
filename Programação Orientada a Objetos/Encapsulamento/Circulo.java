package Exercícios;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
