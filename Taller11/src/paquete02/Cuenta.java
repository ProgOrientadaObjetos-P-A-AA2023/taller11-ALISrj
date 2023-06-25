package paquete02;

import java.util.ArrayList;

public class Cuenta {

    private String nombreCliente;
    private double iva;
    private ArrayList<Menu> carta;
    private double subtotal;
    private double valorCancelar;

    public Cuenta(String n, double i, ArrayList<Menu> c) {
        nombreCliente = n;
        iva = i;
        carta = c;
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public void establecerIva(double n) {
        iva = n;
    }

    public void establecerCartas(ArrayList<Menu> n) {
        carta = n;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < carta.size(); i++) {
            subtotal += carta.get(i).obtenerValorMenu();
        }
    }

    public void establecerValorCancelar() {
        valorCancelar = subtotal + (subtotal * (iva / 100));
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerIva() {
        return iva;
    }

    public ArrayList<Menu> obtenerCartas() {
        return carta;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerCancelartotal() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Factura\n"
                + "Cliente: %s\n",nombreCliente);

        for (int i = 0; i < carta.size(); i++) {
            mensaje = String.format("%s%s\n", 
                    mensaje, 
                    carta.get(i));
        }

        mensaje = String.format("%s\nSubtotal: %.1f\n"
                + "IVA: %.1f \n"
                + "Total a pagar: %.3f\n",
                mensaje,
                subtotal,
                iva,
                valorCancelar);

        return mensaje;
    }

}
