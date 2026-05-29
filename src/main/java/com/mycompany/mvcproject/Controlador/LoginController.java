/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvcproject.Controlador;
import com.mycompany.mvcproject.Modelo.Usuario;
import com.mycompany.mvcproject.Vista.Login;
/**
 *
 * @author jleal
 */
public class LoginController {

    private Usuario usuario;
    private Login vista;

    public LoginController(Usuario usuario, Login vista) {

        this.usuario = usuario;
        this.vista = vista;
    }

    public void iniciar() {

        vista.setVisible(true);
    }
}