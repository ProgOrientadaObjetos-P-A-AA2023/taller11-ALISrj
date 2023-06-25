package paquete02;

public class MenuCarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String n, double vI, double vP, double vB, double pA) {
        super(n, vI);
        valorPorcionGuarnicion = vP;
        valorBebida = vB;
        porcentajeAdicional = pA;
    }

    public void establecerValorPorcionGuarnicion(double n) {
        valorPorcionGuarnicion = n;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    public void establecerPorcentajeAdicional(double n) {
        porcentajeAdicional = n;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = (valorInicialMenu * (porcentajeAdicional / 100))
                + (valorInicialMenu + valorPorcionGuarnicion + valorBebida);
    }

    public double obtenerValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    @Override
    public String toString() {
        return String.format("Menú a la Carta:\n%s"
                + "\tValor guarnición: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                super.toString(),
                valorPorcionGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
    }

}
