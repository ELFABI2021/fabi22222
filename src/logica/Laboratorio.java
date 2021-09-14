package logica;
/* * * * * * * * * * * * * * * * *	* 
 * Fabian Mederos							*
 * ESI buceo - 2BA			*
 * Laboratorio de Programacion							*
 * * * * * * * * * * * * * * * * *	*/
import java.util.Random;

public class Laboratorio {
    
    Random azar = new Random();
    private int numero1;
    private int numero2;
    private String operacion;
    private String dificultad;

    public Laboratorio() {
        
    }

    public Laboratorio(int n1, int n2, String op, String dific) {
        numero1 = n1;
        numero1 = n1;
        numero2 = n2;
        operacion = op;
        dificultad = dific;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int n1) {
        numero1 = n1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int n2) {
        numero2 = n2;
    }

    public void setOperacion(String op) {
        operacion = op;

    }
    public String getOperacion(){
        return operacion;
    }

    public void setDificultad(String dific) {
        dificultad = dific;
    }

    public void digitos() {
        switch (dificultad) {
            case "facil":
                numero1 = 1 + azar.nextInt(9);
                numero2 = 1 + azar.nextInt(9);
                break;

            case "media":
                numero1 = 1 + azar.nextInt(99);
                numero2 = 1 + azar.nextInt(9);
                break;
                
            case "dificil":
                numero1 = 1 + azar.nextInt(99);
                numero2 = 1 + azar.nextInt(99);
                break;
        }
    }

    public String simbolo() {
        String simbolo=null;
        switch (operacion) {
            case "suma":
                simbolo = "+";
                break;
                
            case "resta":
                simbolo = "-";
                break;
                
            case "division":
                simbolo = "/";
                break;
                
            case "multiplicacion":
                simbolo = "x";
                break;
        }
        return simbolo;
    }

    public boolean resultado(int respuesta) {
        boolean resultado = false;
        int operacionFinal=0;
        
        switch(operacion){
            case "suma":
                operacionFinal=numero1+numero2;
                break;
                
            case "resta":
                operacionFinal=numero1-numero2;
                break;
                
            case "division":
                operacionFinal=numero1/numero2;
                break;
                
            case "multiplicacion":
                operacionFinal=numero1*numero2;
                break;
        }        
        if(respuesta==operacionFinal){
            resultado=true;
        }
           return resultado;  
    }      

    public String mensajeCorrecto() {                                            // Mensajes aleatorios correctos
        String mensajeCorrecto = null;  
        int m;                                                  
        m = 1 + azar.nextInt(4);
        switch (m) {
            case 1:
                mensajeCorrecto= "bien";
                break;

            case 2:
                mensajeCorrecto = "Muy bien";
                break;

            case 3:
                mensajeCorrecto = "Sigue asi";
                break;

            case 4:
               mensajeCorrecto = "bien ahi vos";
                break;
        }
        return mensajeCorrecto;
    }

    public String mensajeINCorrecto() {                                          // Mensajes aleatorios incorrectos
        String mensajeINCorrecto=null;  
        int m;                                               
        m = 1 + azar.nextInt(4);
        switch (m) {
            case 1:
                mensajeINCorrecto = "mal";
                break;

            case 2:
                mensajeINCorrecto = "terrible";
                break;

            case 3:
                mensajeINCorrecto = "segui intentando";
                break;

            case 4:
                mensajeINCorrecto = "mal, dale que vos podes";
                break;
        }
        return mensajeINCorrecto;
    }

    @Override
    public String toString() {
        return numero1 + " " + simbolo() + " " + numero2;
    }
}
