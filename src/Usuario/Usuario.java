
package Usuario;

import javax.swing.JOptionPane;


public class Usuario {
    private String usuario;
    private int Score;
    
    public String Jugador(){
       usuario = JOptionPane.showInputDialog("Iingrese su nombre para registrase");
       return usuario;
   }
    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

   public void Condiciones (){
        System.out.println("TE SALDRAN PREGUNTAS DE ESTOS TIPOS");
        System.out.println("---------------");
        System.out.println(" Random");
        System.out.println(" Cultura");
        System.out.println(" Arte");
        System.out.println(" Animales");
        System.out.println(" Deportes");
        System.out.println("---------------");
   }
    
}
