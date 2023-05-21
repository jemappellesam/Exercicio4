public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        double semiPerimetro = calcularPerimetro() / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    @Override
    public String toString() {
        String tipoTriangulo = determinarTipoTriangulo();
        return "Área do triângulo: " + calcularArea() + "\nPerímetro do triângulo: " + calcularPerimetro() + "\nTipo de triângulo: " + tipoTriangulo;
    }

    private String determinarTipoTriangulo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }
}
