package paquete02;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorInicialMenu;
    protected double valorMenu;

    public Menu(String n, double vI) {
        nombrePlato = n;
        valorInicialMenu = vI;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorInicialMenu(double n) {
        valorInicialMenu = n;
    }

    public abstract void establecerValorMenu();

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicialMenu() {
        return valorInicialMenu;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        return String.format("\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n",
                nombrePlato,
                valorInicialMenu);
    }

}
