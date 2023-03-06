package Servicio;

public class Moneda {

    public final double cotizacion_Dolar = 371.00;
    public final double cotizacion_Euro = 210.83;
    public final double cotizacion_Libras = 237.99;
    public final double cotizacion_Yen = 1.46;
    public final double cotizacion_Won = 9.58;

    public Moneda() {
    }

    public double pesoDolar(double moneda) {
        return (moneda / this.cotizacion_Dolar);

    }

    public double dolarPeso(double moneda) {
        return (moneda * this.cotizacion_Dolar);

    }

    public double pesoEuro(double moneda) {
        return (moneda / this.cotizacion_Euro);

    }

    public double euroPeso(double moneda) {
        return (moneda * this.cotizacion_Euro);

    }

    public double pesoLibra(double moneda) {
        return (moneda / this.cotizacion_Libras);

    }

    public double libraPeso(double moneda) {
        return (moneda * this.cotizacion_Libras);

    }

    public double pesoYen(double moneda) {
        return (moneda / this.cotizacion_Yen);

    }

    public double yenPeso(double moneda) {
        return (moneda * this.cotizacion_Yen);

    }

    public double pesoWon(double moneda) {
        return (moneda / this.cotizacion_Won);

    }

    public double wonPeso(double moneda) {
        return (moneda / this.cotizacion_Won);

    }

}
