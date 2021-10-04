
package Registros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import Usuario.Usuario;


public class Guardado {
    public void IngresarRegistro(int score) {

        Usuario u1 = new Usuario();
        File j;
        FileWriter m;
        PrintWriter v;
        j = new File("Marcador.txt");
            try {
                u1.setUsuario(u1.getUsuario());
                m = new FileWriter(j, true);
                v = new PrintWriter(m);
                v.print(u1.Jugador() + "\n");
                v.print(score + "\n");
                v.print("************************** \n");

                v.close();
                m.close();

            } catch (IOException e) {
                System.out.println("error " + e.getMessage());
            }

        }
         public void RecibirRegistro(){
        File archivo;
        FileReader i;
        BufferedReader l;
        
        try {
            archivo = new File("Marcador.txt");
            i = new FileReader(archivo);
            l = new BufferedReader(i);
            
            String linea;
            while((linea = l.readLine())!= null){
                System.out.println(linea);
            }
            l.close();
            i.close();
                
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }

    }
    
   
}

