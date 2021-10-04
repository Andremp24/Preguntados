
package Principal;
import Niveles.*;
import Usuario.Usuario;

public class Test {
    public static void main(String[] args) {
        Usuario u = new Usuario();
        Ronda_Uno r1 = new Ronda_Uno();
        Ronda_Dos r2 = new Ronda_Dos();
        Ronda_Tres r3 = new Ronda_Tres();
        Ronda_Cuatro r4 = new Ronda_Cuatro();
        Ronda_Cinco r5 = new Ronda_Cinco(); 
        
       u.Condiciones();
       r1.rondauno();
       r2.rondados();
       r3.rondatres();
       r4.rondacuatro();
       r5.rondacinco();
    }
}
