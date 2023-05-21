public class Quadrilatero {
    private double base1;
    private double base2;
    private double lado1;
    private double lado2;

    public Quadrilatero(double L1, double L2, double L3, double L4){
        this.base1=L1;
        this.base2=L2;
        this.lado1=L3;
        this.lado2=L4;
    }
    public String classifica(){
        if(this.base1==this.lado1){
            return "É quadrado";
        }
        else {
            return "É retangulo";
        }
    }
    public double area(){
        return this.base1*this.lado1;
    }
    public double perimetro(){
        return this.base1+this.base2+this.lado1+this.lado2;
    }

    @Override
    public String toString() {
        return " Classificação: "+classifica() +"\n Área: "+area()+"\n Perímetro: "+perimetro();
    }

}
