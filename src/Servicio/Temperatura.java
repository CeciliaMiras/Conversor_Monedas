
package Servicio;

public class Temperatura {
    double temperatura;

    public Temperatura() {
    }

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    public double conversor_Temperaturafahrenheit(double temperatura){
        return (temperatura*1.8+32);
    }
     public double conversor_Temperaturacelsius(double temperatura){
        return((temperatura-32)/1.8);
    }
    
}
