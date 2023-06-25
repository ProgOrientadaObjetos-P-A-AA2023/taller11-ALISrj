package paquete01;

import java.util.ArrayList;
import paquete02.*;

public class Ejecutor01 {

    public static void main(String[] args) {

        ArrayList<Menu> carta = new ArrayList();

        Menu menu1 = new MenuNinos("Niños 01", 2, 1, 1.5);
        Menu menu2 = new MenuNinos("Niños 02", 3, 1, 1.5);
        Menu menu3 = new MenuEconomico("Econo 001", 4, 25);
        Menu menu4 = new MenuDia("Dia 001", 5, 1, 1);
        Menu menu5 = new MenuCarta("Carta 001", 6, 1.5, 2, 10);
        
        carta.add(menu1);
        carta.add(menu2);
        carta.add(menu3);
        carta.add(menu4);
        carta.add(menu5);

        for (int i = 0; i < carta.size(); i++) {
            carta.get(i).establecerValorMenu();
            System.out.printf("%.2f\n",
                    carta.get(i).obtenerValorMenu());
        }

        Cuenta miCuenta = new Cuenta("René Elizalde", 10, carta);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);

    }

}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu de Niños:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu de Niños:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/
