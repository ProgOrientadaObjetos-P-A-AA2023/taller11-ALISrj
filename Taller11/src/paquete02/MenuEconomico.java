package paquete02;

public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String n, double vI, double pD) {
        super(n, vI);
        porcentajeDescuento = pD;
    }

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMenu 
                -(valorInicialMenu* (porcentajeDescuento / 100));
    }

    @Override
    public String toString() {
        return String.format("Menú Económico:\n%s"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                super.toString(),
                porcentajeDescuento,
                valorMenu);
    }

}
