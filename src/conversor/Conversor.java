package conversor;

import Servicio.Moneda;
import Servicio.Temperatura;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) throws Exception {
        Moneda moneda = new Moneda();
        Temperatura temperatura = new Temperatura();
        Object[] options = {"Conversor Divisas", "Conversor Temperatura", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "Elige una opción", "Conversores", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        if (elige == 0) {
            DecimalFormat formatearDivisas = new DecimalFormat();
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String opciones[] = {"Pesos a Dolares", "Dolares a Pesos", "Pesos a Euros", "Euros a Pesos",
                    "Pesos a Libras", "Libras a Pesos", "Pesos a Yen", "Yen a Pesos", "Pesos a Won", "Won a Pesos"};

                String cambio = (String) JOptionPane.showInputDialog(null, "Elegir una opcion", "Conversor de Monedas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad:");
                double pesos = 0;
                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }
                if (cambio.equals("Pesos a Dolares")) {
                    JOptionPane.showMessageDialog(null, +moneda.pesoDolar(pesos) + " " + "DOLARES");

                } else if (cambio.equals("Dolares a Pesos")) {
                    JOptionPane.showMessageDialog(null, +moneda.dolarPeso(pesos) + " " + "PESOS");
                } else if (cambio.equals("Pesos a Euros")) {
                    JOptionPane.showMessageDialog(null, +moneda.pesoEuro(pesos) + " " + "EUROS");
                } else if (cambio.equals("Euros a Pesos")) {
                    JOptionPane.showMessageDialog(null, +moneda.euroPeso(pesos) + " " + "PESOS");
                } else if (cambio.equals("Pesos a Libras")) {
                    JOptionPane.showMessageDialog(null, +moneda.pesoLibra(pesos) + " " + "LIBRAS");
                } else if (cambio.equals("Libras a Pesos")) {
                    JOptionPane.showMessageDialog(null, +moneda.libraPeso(pesos) + " " + "PESOS");
                } else if (cambio.equals("Pesos a Yen")) {
                    JOptionPane.showMessageDialog(null, +moneda.pesoYen(pesos) + " " + "YEN");
                } else if (cambio.equals("Yen a Pesos")) {
                    JOptionPane.showMessageDialog(null, +moneda.yenPeso(pesos) + " " + "PESOS");
                } else if (cambio.equals("Pesos a Won")) {
                    JOptionPane.showMessageDialog(null, +moneda.pesoWon(pesos) + " " + "WON");
                } else if (cambio.equals("Won a Pesos")) {
                    JOptionPane.showMessageDialog(null, +moneda.wonPeso(pesos) + " " + "PESOS");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar", "confrimar", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }

            }
        }
        if (elige == 1) {
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String[] opciones = {"Celsius a fahrenheit", "fahrenheit a Celsius"};
                String opcion = (String) JOptionPane.showInputDialog(null, "Elegir una opcion", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese Cantidad a Convertir:");
                double valor = 0;
                try {
                    valor = Double.parseDouble(valorNominal);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }

                if (opcion.equals("Celsius a fahrenheit")){
                    JOptionPane.showMessageDialog(null, +temperatura.conversor_Temperaturafahrenheit(valor) + " " + "Grados Fahrenheit");
                } else if (opcion.equals("fahrenheit a Celsius")){

                    JOptionPane.showMessageDialog(null, +temperatura.conversor_Temperaturacelsius(valor) + " " + "Grados Celsius");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar", "confrimar", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }

            }
        }

    }

}
