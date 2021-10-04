package Niveles;

import Usuario.Usuario;
import javax.swing.JOptionPane;
import preguntados.Preguntados;
import Registros.Guardado;

public class Ronda_Cinco {

    Usuario u = new Usuario();
    Preguntados p1 = new Preguntados();
    Guardado G1 = new Guardado();

    public void rondacinco() {
        int opcion;

        p1.nivelAnimales();
        p1.nivelArte();
        p1.nivelCultura();
        p1.nivelDeportes();
        p1.nivelRandom();
        int elegir;

        opcion = (int) (Math.random() * 5 + 1);

        switch (opcion) {
            case 1:
                System.out.println(" ");
                System.out.println("Esta es la ultima pregunta por 5 puntos");
                System.out.println(" ");
                System.out.println(p1.condicion[0][4]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (elegir > 4 || elegir < 1);
                if (elegir == 2) {
                    u.setScore(5);
                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    System.out.println("Felicitaciones,HAS CONCLUIDO EL JUEGO");
                    System.out.println(" ");
                    System.out.println("Felicitaciones Ganaste $5" + "PUNTOS");
                    System.out.println(" ");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    G1.RecibirRegistro();

                } else {
                    u.setScore(4);
                    System.out.println(" ");
                    System.out.println("resúesta aquivocada");
                    System.out.println(" ");
                    System.out.println("La opcion corrrecta es la 2");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);

                }
                break;
            case 2:
                System.out.println(" ");
                System.out.println("Esta es la ultima pregunta por 5 puntos");
                System.out.println(" ");
                System.out.println(p1.condicion[1][4]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (elegir > 4 || elegir < 1);
                if (elegir == 4) {
                    u.setScore(5);
                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    System.out.println("Felicitaciones,HAS CONCLUIDO EL JUEGO");
                    System.out.println(" ");
                    System.out.println("Felicitaciones Ganaste $5" + "PUNTOS");
                    System.out.println(" ");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    G1.RecibirRegistro();

                } else {
                    u.setScore(4);
                    System.out.println(" ");
                    System.out.println("resúesta aquivocada");
                    System.out.println(" ");
                    System.out.println("La opcion corrrecta es la 4");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);

                }
                break;
            case 3:
                System.out.println(" ");
                System.out.println("Esta es la ultima pregunta por 5 puntos");
                System.out.println(" ");
                System.out.println(p1.condicion[2][4]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (elegir > 4 || elegir < 1);
                if (elegir == 1) {
                    u.setScore(5);
                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    System.out.println("Felicitaciones,HAS CONCLUIDO EL JUEGO");
                    System.out.println(" ");
                    System.out.println("Felicitaciones Ganaste $5" + "PUNTOS");
                    System.out.println(" ");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    G1.RecibirRegistro();

                } else {
                    u.setScore(4);
                    System.out.println(" ");
                    System.out.println("resúesta aquivocada");
                    System.out.println(" ");
                    System.out.println("La opcion corrrecta es la 1");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);

                }
                break;
            case 4:
                System.out.println(" ");
                System.out.println("Esta es la ultima pregunta por 5 puntos");
                System.out.println(" ");
                System.out.println(p1.condicion[3][4]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (elegir > 4 || elegir < 1);
                if (elegir == 2) {
                    u.setScore(5);
                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    System.out.println("Felicitaciones,HAS CONCLUIDO EL JUEGO");
                    System.out.println(" ");
                    System.out.println("Felicitaciones Ganaste $5" + "PUNTOS");
                    System.out.println(" ");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    G1.RecibirRegistro();

                } else {
                    u.setScore(4);
                    System.out.println(" ");
                    System.out.println("resúesta aquivocada");
                    System.out.println(" ");
                    System.out.println("La opcion corrrecta es la 2");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);

                }
                break;
            case 5:
                System.out.println(" ");
                System.out.println("Esta es la ultima pregunta por 5 puntos");
                System.out.println(" ");
                System.out.println(p1.condicion[4][4]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la respuesta correcta"));
                } while (elegir > 4 || elegir < 1);
                if (elegir == 3) {
                    u.setScore(5);
                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    System.out.println("Felicitaciones,HAS CONCLUIDO EL JUEGO");
                    System.out.println(" ");
                    System.out.println("Felicitaciones Ganaste $5" + "PUNTOS");
                    System.out.println(" ");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("REGISTRO DE PARTICIPANTES");
                    G1.RecibirRegistro();

                } else {
                    u.setScore(4);
                    System.out.println(" ");
                    System.out.println("resúesta aquivocada");
                    System.out.println(" ");
                    System.out.println("La opcion corrrecta es la 3");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);

                }
                break;

        }
    }
}
