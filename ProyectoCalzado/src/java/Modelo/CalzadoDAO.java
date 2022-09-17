package Modelo;

public class CalzadoDAO {

    Calzado obj = new Calzado();
    String resultado;

    public String CalcularCalzado(String marca, int talla, int numeroparesvendidos) {

        int talla1 = talla, pares1 = numeroparesvendidos;
        obj.setNumeroparesvendidos(pares1);
        obj.setTalla(talla);
       
        String marcas = String.valueOf(marca);
        switch (marcas) {
            case "Batta": {
                switch (talla1) {
                    case 30: {
                        obj.setCostoparcalzado(pares1 * 130);
                        obj.costoparcalzado = (pares1 * 130);
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                    case 35: {
                        obj.setCostoparcalzado(pares1 * 132);
                        obj.costoparcalzado = pares1 * 132;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                    case 39: {
                        obj.setCostoparcalzado(pares1 * 144);
                        obj.costoparcalzado = pares1 * 144;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                    case 40: {
                        obj.setCostoparcalzado(pares1 * 150);
                        obj.costoparcalzado = pares1 * 150;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                    case 44: {
                        obj.setCostoparcalzado(pares1 * 155);
                        obj.costoparcalzado = pares1 * 155;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                }
                break;
            }
            case "Calimod": {
                switch (talla1) {
                    case 30: {
                        obj.setCostoparcalzado(pares1 * 122);
                        obj.costoparcalzado = pares1 * 122;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                    case 35: {
                        obj.setCostoparcalzado(pares1 * 125);
                        obj.costoparcalzado = pares1 * 125;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                    case 39: {
                        obj.setCostoparcalzado(pares1 * 127);
                        obj.costoparcalzado = pares1 * 127;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                    case 40: {
                        obj.setCostoparcalzado(pares1 * 130);
                        obj.costoparcalzado = pares1 * 130;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                    case 44: {
                        obj.setCostoparcalzado(pares1 * 144);
                        obj.costoparcalzado = pares1 * 144;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);
                        obj.setResultado(resultado);
                        break;
                    }
                }
                break;
            }
            case "Azaleia": {
                switch (talla1) {
                    case 30: {
                        obj.setCostoparcalzado(pares1 * 120);
                        obj.costoparcalzado = pares1 * 120;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                    case 35: {
                        obj.setCostoparcalzado(pares1 * 125);
                        obj.costoparcalzado = pares1 * 125;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                    case 39: {
                        obj.setCostoparcalzado(pares1 * 130);
                        obj.costoparcalzado = pares1 * 130;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                    case 40: {
                        obj.setCostoparcalzado(pares1 * 137);
                        obj.costoparcalzado = pares1 * 137;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                    case 44: {
                        obj.setCostoparcalzado(pares1 * 144);
                        obj.costoparcalzado = pares1 * 144;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                }
                break;
            }
            case "Renzo Costa": {
                switch (talla1) {
                    case 30: {
                        obj.setCostoparcalzado(pares1 * 155);
                        obj.costoparcalzado = pares1 * 155;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                    case 35: {
                        obj.setCostoparcalzado(pares1 * 160);
                        obj.costoparcalzado = pares1 * 160;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                    case 39: {
                        obj.setCostoparcalzado(pares1 * 167);
                        obj.costoparcalzado = pares1 * 167;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                    case 40: {
                        obj.setCostoparcalzado(pares1 * 170);
                        obj.costoparcalzado = pares1 * 170;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                    case 44: {
                        obj.setCostoparcalzado(pares1 * 177);
                        obj.costoparcalzado = pares1 * 177;
                        calculardatos(obj.costoparcalzado, marca, numeroparesvendidos);

                        break;
                    }
                }
                break;
            }
        }
        resultado = "Costo Bruto: " + obj.getCostoparcalzado()
                + "\nIGV: " + obj.getIgv() + "\nDescuento: " + obj.getDescuento()
                + "\nVenta Neta: " + obj.getVentaneta() + "\nMarca: " + marca + "\nTalla: " + obj.getTalla() + "\nPares: " + obj.getNumeroparesvendidos();

        return resultado;
    }

    public void calculardatos(int costopar, String marca, int pares) {
        costopar = obj.getCostoparcalzado();
        if (obj.getNumeroparesvendidos() >= 2 && obj.getNumeroparesvendidos() <= 5) {
            obj.setDescuento(0.05 * costopar);
            obj.setIgv(costopar * 0.18);
            obj.setVentaneta(costopar - obj.getDescuento() - obj.getIgv());
            System.out.println("Descuento: " + obj.descuento);
            System.out.println("IGV: " + obj.igv);
            System.out.println("Venta Neta: " + obj.ventaneta);
        } else if (obj.getNumeroparesvendidos() >= 6 && obj.getNumeroparesvendidos() <= 10) {
            obj.setDescuento((0.08 * costopar));
            obj.setIgv(costopar * 0.18);
            obj.setVentaneta(costopar - obj.getDescuento() - obj.getIgv());
        } else if (obj.getNumeroparesvendidos() >= 11 && obj.getNumeroparesvendidos() <= 20) {
            obj.setDescuento((0.10 * costopar));
            obj.setIgv(costopar * 0.18);
            obj.setVentaneta(costopar - obj.getDescuento() - obj.getIgv());

        } else if (obj.getNumeroparesvendidos() >= 21 && obj.getNumeroparesvendidos() <= 30) {
            obj.setDescuento((0.15 * costopar));
            obj.setIgv(costopar * 0.18);
            obj.setVentaneta(costopar - obj.getDescuento() - obj.getIgv());

        } else if (obj.getNumeroparesvendidos() >= 31) {
            obj.setDescuento((0.17 * costopar));
            obj.setIgv(costopar * 0.18);
            obj.setVentaneta(costopar - obj.getDescuento() - obj.getIgv());

        }

    }

}
