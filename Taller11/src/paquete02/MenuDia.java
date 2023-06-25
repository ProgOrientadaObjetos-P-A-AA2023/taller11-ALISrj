package paquete02;

public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String n, double vI, double vP, double vB) {
        super(n, vI);
        valorPostre = vP;
        valorBebida = vB;
    }

    public void establecerValorPostre(double n) {
        valorPostre = n;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorBebida + valorPostre;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public String toString() {
        return String.format("Menú del Día:\n%s"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                super.toString(),
                valorBebida,
                valorPostre,
                valorMenu);
    }

}
