package Modelo;

public class Calzado {

    String Marca;
    int talla;
    int costoparcalzado;
    int numeroparesvendidos;
    double descuento;
    double igv;
    double ventaneta;
    String resultado;

    public Calzado(String Marca, int talla, int costoparcalzado, int numeroparesvendidos, double descuento, double igv, double ventaneta, String resultado) {
        this.Marca = Marca;
        this.talla = talla;
        this.costoparcalzado = costoparcalzado;
        this.numeroparesvendidos = numeroparesvendidos;
        this.descuento = descuento;
        this.igv = igv;
        this.ventaneta = ventaneta;
        this.resultado = resultado;
    }
public Calzado(){
}
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getCostoparcalzado() {
        return costoparcalzado;
    }

    public void setCostoparcalzado(int costoparcalzado) {
        this.costoparcalzado = costoparcalzado;
    }

    public int getNumeroparesvendidos() {
        return numeroparesvendidos;
    }

    public void setNumeroparesvendidos(int numeroparesvendidos) {
        this.numeroparesvendidos = numeroparesvendidos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getVentaneta() {
        return ventaneta;
    }

    public void setVentaneta(double ventaneta) {
        this.ventaneta = ventaneta;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

   

    
}
