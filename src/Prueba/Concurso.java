package Prueba;


import java.util.Collections;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Arrays;

public class Concurso {
    private String nombre;
    private final Integer numero_de_problemas;
    private HashSet<String> lista_de_equipos;
    private LinkedList<Envio> lista_de_respuestas;
    
    
    public Concurso(String nombre, Integer Numero_de_problemas) {
        this.nombre = nombre;
        this.numero_de_problemas = Numero_de_problemas;
        this.lista_de_equipos = new HashSet<>();
        this.lista_de_respuestas = new LinkedList<>();
    }
    
 
    public Concurso(String nombre) {
        this(nombre, 5); 
    }
    
    
    public String getNombre() { return nombre; }
    public Integer getNumero_de_problemas() { return numero_de_problemas; }
    public HashSet<String> getLista_de_equipos() { return lista_de_equipos; }
    
    
    

    public int getNumEquipos() { return this.lista_de_equipos.size(); }
    
   
    public void añadirEquipos(String... St) {
      
        Collections.addAll(lista_de_equipos, St);
    }
    
    boolean eliminar_equipo(String equipo) {
        
        LinkedList<Envio> envios = new LinkedList<>();
        for(Envio envi : this.lista_de_respuestas) {
            if(envi.getNombre_del_equipo().equals(equipo)) {
                envios.add(envi);
            }
        }
     
        this.lista_de_respuestas.removeAll(envios);
            return this.lista_de_equipos.remove(equipo);
    }
    
    public Envio registrarEnvio(String lista_de_equipos, Integer numero_de_problema, String lista_de_respuestas) {
        if(this.lista_de_equipos.contains(lista_de_equipos)) { 
            if(!(numero_de_problema < 0) && (numero_de_problema <= numero_de_problemas)) {
                if((lista_de_respuestas != null) && !(lista_de_respuestas.isEmpty())) {
                    Envio envi = new Envio(lista_de_equipos, numero_de_problema, lista_de_respuestas);
                    this.lista_de_respuestas.add(envi);
                    return envi;
                }
            }
        }
                return null;
    }
}
