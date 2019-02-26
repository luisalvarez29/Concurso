package Prueba;

public class Envio {
    private final String nombre_del_equipo;
    private final int numero_de_problema;
    private final String respuesta;

    public Envio(String nombre_del_equipo, int numero_De_problema, String respuesta) {
        this.nombre_del_equipo = nombre_del_equipo;
        this.numero_de_problema = numero_De_problema;
        this.respuesta = respuesta;
    }    
    
    
    public String getNombre_del_equipo() { return nombre_del_equipo; }
    public int getNumero_de_problema() { return numero_de_problema; }
    public String getRespuesta() { return respuesta; }
}