package paquete02;

public class MenuNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String n, double vI, double pH, double pP) {
        super(n, vI);
        valorHelado = pH;
        valorPastel = pP;

    }

    public void establecerPorcionHelado(double n) {
        valorHelado = n;
    }

    public void establecerPorcionPastel(double n) {
        valorPastel = n;
    }

    public double obtenerPorcionPastel() {
        return valorPastel;
    }

    public double obtenerPorcionHelado() {
        return valorHelado;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return String.format("Menú de Niños:\n%s"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                super.toString(),
                valorHelado,
                valorPastel,
                valorMenu);
    }

}
