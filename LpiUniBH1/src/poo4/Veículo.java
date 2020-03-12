


package poo4;

public class Veículo {
    public Veículo(){
        System.out.print("Novo Carro: ");
        
    }
    private String marca;
    private double captanque;
     
    
    public String getMarca() {
        return marca;
    }

    public double getCaptanque() {
        return captanque;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCaptanque(double captanque) {
        this.captanque = captanque;
    }
    
    public void buzinar(){
        System.out.println("Buuuuuuuuuuuuuuum");
    }
}
