/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;

import java.util.ArrayList;

/**
 *
 * @author francisco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<UsuariosParaInicioSecion> lista_usuarios = new ArrayList<>();
       
       UsuariosParaInicioSecion tiburcio = new UsuariosParaInicioSecion("Carlos", "tiburcio");
       lista_usuarios.add(tiburcio);
       
       UsuariosParaInicioSecion fernando = new UsuariosParaInicioSecion("Fernando", "jimenez");
       lista_usuarios.add(fernando);
       
       UsuariosParaInicioSecion padilla = new UsuariosParaInicioSecion("David", "avila");
       lista_usuarios.add(padilla);
       
       InicioSecionVentana login = new InicioSecionVentana(lista_usuarios);
       login.setVisible(true);

    }

}
