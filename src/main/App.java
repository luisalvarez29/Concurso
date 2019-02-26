package main;

import Prueba.Concurso;
import java.util.HashSet;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        Concurso concurso1 = new Concurso("Sesion 1", 2);
        Concurso concurso2 = new Concurso("Sesion 2", 3);
        Concurso concurso3 = new Concurso("Sesion 3", 3);
        
        LinkedList<Concurso> lista = new LinkedList<>();
        lista.add(concurso1);
        lista.add(concurso2);
        lista.add(concurso3);

        for (Concurso concur : lista) {
            System.out.println("Nombre del Concurso: " + concur.getNombre());
            concur.añadirEquipos("Equipo 1", "Equipo 2", "Equipo 3");
            HashSet<String> equipos = concur.getLista_de_equipos();
            for (String St : equipos) {
                for (int i = 1; i <= concur.getNumero_de_problemas(); i++) {
                    concur.registrarEnvio(St, i, "(1, 2)");
                }
            }
        }
    }
}
