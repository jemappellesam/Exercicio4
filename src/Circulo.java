public class Circulo {
    private double raio;
    public String area (){
        return String.format("%.2f",Math.PI*Math.pow(this.raio,2));
    }
    public String perimetro(){
        return String.format ("%.2f",(2*Math.PI*this.raio));
    }

    @Override
    public String toString() {
        return " Área do círculo: "+ area() +"\n Perímetro do círculo: "+perimetro()+"\n Raio do círculo: "+this.raio;
    }
    public Circulo(double Raio){
        this.raio=Raio;
    }
}
