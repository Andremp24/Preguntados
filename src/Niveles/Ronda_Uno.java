package Niveles;

import Usuario.Usuario;
import javax.swing.JOptionPane;
import preguntados.Preguntados;
import Registros.Guardado;

public class Ronda_Uno {

    Usuario u = new Usuario();
    Preguntados p1 = new Preguntados();
    Guardado G1 = new Guardado();

    public void rondauno() {
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
                System.out.println("Esta pregunta es por un punto : $1");
                System.out.println(" ");
                System.out.println(p1.condicion[0][0]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion"));
                } while (elegir > 4 || elegir < 1);

                if (elegir == 3) {

                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    JOptionPane.showMessageDialog(null, "FELICIDADES ACABA DE GANAR $1");
                    System.out.println(" ");
                    u.setScore(1);
                    System.out.println("su puntaje actual es $" + u.getScore());
                    System.out.println(" ");
                    System.out.println("Seguir avanzando por : $2");
                    System.out.println(" ");
                    System.out.println(" Quieres seguir oprima 1 \n  si se desea retirar con " + u.getScore() + " Presione 2");
                    System.out.println(" ");
                    do {
                        elegir = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (elegir > 2 || elegir < 1);

                    if (elegir == 1) {
                        System.out.println(" ");
                        System.out.println("Vas por la otra pregunta ");
                        System.out.println(" ");

                    } else if (elegir == 2) {

                        System.out.println("Bien jugado");
                        System.out.println("Tu tienes : " + u.getScore() + "puntos ");
                        G1.IngresarRegistro(u.getScore());
                        System.out.println("Guardado de jugadores");
                        G1.RecibirRegistro();
                        System.exit(0);

                    }
                } else {
                    u.setScore(0);
                    System.out.println(" ");
                    System.out.println(" respuesta equivocada");
                    System.out.println(" ");
                    System.out.println("Opcion correcta era la 3");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("Esta pregunta es por un punto : $1");
                System.out.println(" ");
                System.out.println(p1.condicion[1][0]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion"));
                } while (elegir > 4 || elegir < 1);

                if (elegir == 4) {

                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    JOptionPane.showMessageDialog(null, "FELICIDADES ACABA DE GANAR $1");
                    System.out.println(" ");
                    u.setScore(1);
                    System.out.println("su puntaje actual es $" + u.getScore());
                    System.out.println(" ");
                    System.out.println("Seguir avanzando por : $2");
                    System.out.println(" ");
                    System.out.println(" Quieres seguir oprima 1 \n  si se desea retirar con " + u.getScore() + " Presione 2");
                    System.out.println(" ");
                    do {
                        elegir = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (elegir > 2 || elegir < 1);

                    if (elegir == 1) {
                        System.out.println(" ");
                        System.out.println("Vas por la otra pregunta ");
                        System.out.println(" ");

                    } else if (elegir == 2) {

                        System.out.println("Bien jugado");
                        System.out.println("Tu tienes : " + u.getScore() + "puntos ");
                        G1.IngresarRegistro(u.getScore());
                        System.out.println("Guardado de jugadores");
                        G1.RecibirRegistro();
                        System.exit(0);
                    }
                } else {
                    u.setScore(0);
                    System.out.println(" ");
                    System.out.println(" respuesta equivocada");
                    System.out.println(" ");
                    System.out.println("Opcion correcta era la 4");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);
                }
                break;
            case 3:
                System.out.println("Esta pregunta es por un punto : $1");
                System.out.println(" ");
                System.out.println(p1.condicion[2][0]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion"));
                } while (elegir > 4 || elegir < 1);

                if (elegir == 1) {

                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    JOptionPane.showMessageDialog(null, "FELICIDADES ACABA DE GANAR $1");
                    System.out.println(" ");
                    u.setScore(1);
                    System.out.println("su puntaje actual es $" + u.getScore());
                    System.out.println(" ");
                    System.out.println("Seguir avanzando por : $2");
                    System.out.println(" ");
                    System.out.println(" Quieres seguir oprima 1 \n  si se desea retirar con " + u.getScore() + " Presione 2");
                    System.out.println(" ");
                    do {
                        elegir = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (elegir > 2 || elegir < 1);

                    if (elegir == 1) {
                        System.out.println(" ");
                        System.out.println("Vas por la otra pregunta ");
                        System.out.println(" ");

                    } else if (elegir == 2) {

                        System.out.println("Bien jugado");
                        System.out.println("Tu tienes : " + u.getScore() + "puntos ");
                        G1.IngresarRegistro(u.getScore());
                        System.out.println("Guardado de jugadores");
                        G1.RecibirRegistro();
                        System.exit(0);

                    }
                } else {
                    u.setScore(0);
                    System.out.println(" ");
                    System.out.println(" respuesta equivocada");
                    System.out.println(" ");
                    System.out.println("Opcion corretacta era la 1");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);
                }
                break;
            case 4:
                System.out.println("Esta pregunta es por un punto : $1");
                System.out.println(" ");
                System.out.println(p1.condicion[4][0]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion"));
                } while (elegir > 4 || elegir < 1);

                if (elegir == 4) {

                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    JOptionPane.showMessageDialog(null, "FELICIDADES ACABA DE GANAR $1");
                    System.out.println(" ");
                    u.setScore(1);
                    System.out.println("su puntaje actual es $" + u.getScore());
                    System.out.println(" ");
                    System.out.println("Seguir avanzando por : $2");
                    System.out.println(" ");
                    System.out.println(" Quieres seguir oprima 1 \n  si se desea retirar con " + u.getScore() + " Presione 2");
                    System.out.println(" ");
                    do {
                        elegir = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (elegir > 2 || elegir < 1);

                    if (elegir == 1) {
                        System.out.println(" ");
                        System.out.println("Vas por la otra pregunta ");
                        System.out.println(" ");

                    } else if (elegir == 2) {

                        System.out.println("Bien jugado");
                        System.out.println("Tu tienes : " + u.getScore() + "puntos ");
                        G1.IngresarRegistro(u.getScore());
                        System.out.println("Guardado de jugadores");
                        G1.RecibirRegistro();
                        System.exit(0);

                    }
                } else {
                    u.setScore(0);
                    System.out.println(" ");
                    System.out.println(" respuesta equivocada");
                    System.out.println(" ");
                    System.out.println("Opcion corretacta era la 4");
                    System.out.println("Fin del juego");
                    G1.IngresarRegistro(u.getScore());
                    System.out.println("Guardado de jugadores");
                    G1.RecibirRegistro();
                    System.exit(0);
                }
                break;
            case 5:
                System.out.println("Esta pregunta es por un punto : $1");
                System.out.println(" ");
                System.out.println(p1.condicion[5][0]);
                do {
                    elegir = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opcion"));
                } while (elegir > 4 || elegir < 1);

                if (elegir == 2) {

                    System.out.println(" ");
                    System.out.println(" CORRECTA");
                    System.out.println(" ");
                    JOptionPane.showMessageDialog(null, "FELICIDADES ACABA DE GANAR $1");
                    System.out.println(" ");
                    u.setScore(1);
                    System.out.println("su puntaje actual es $" + u.getScore());
                    System.out.println(" ");
                    System.out.println("Seguir avanzando por : $2");
                    System.out.println(" ");
                    System.out.println(" Quieres seguir oprima 1 \n  si se desea retirar con " + u.getScore() + " Presione 2");
                    System.out.println(" ");
                    do {
                        elegir = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion"));

                    } while (elegir > 2 || elegir < 1);

                    if (elegir == 1) {
                        System.out.println(" ");
                        System.out.println("Vas por la otra pregunta ");
                        System.out.println(" ");

                    } else if (elegir == 2) {

                        System.out.println("Bien jugado");
                        System.out.println("Tu tienes : " + u.getScore() + "puntos ");
                        G1.IngresarRegistro(u.getScore());
                        System.out.println("Guardado de jugadores");
                        G1.RecibirRegistro();
                        System.exit(0);

                    }
                } else {
                    u.setScore(0);
                    System.out.println(" ");
                    System.out.println(" respuesta equivocada");
                    System.out.println(" ");
                    System.out.println("Opcion corretacta era la 2");
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
