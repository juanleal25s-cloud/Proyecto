/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mvcproject;

/**
 *
 * @author jleal
 */
import com.mycompany.mvcproject.Modelo.Usuario;
import com.mycompany.mvcproject.Vista.Login;
import com.mycompany.mvcproject.Controlador.LoginController;

public class MVCproject {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("jose", "1234");

        Login vista = new Login();

        LoginController controller =
                new LoginController(usuario, vista);

        controller.iniciar();
    }
}
