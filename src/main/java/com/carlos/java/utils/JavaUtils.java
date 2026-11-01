/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.carlos.java.utils;

import static com.carlos.java.utils.security.PasswordUtil.hashear;
import static com.carlos.java.utils.security.PasswordUtil.verificarContrasenia;

/**
 *
 * @author Carlos
 */
public class JavaUtils {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setPassword("123456");
        Cliente cliente2 = new Cliente();
        cliente2.setPassword("abcde");
        String contrahasheada = hashear(cliente1.getPassword());
        System.out.println("La contrasenia plana es: "+ cliente1.getPassword());
        System.out.println("La constrasenia hasheada es: " + contrahasheada);
        
        if (verificarContrasenia(cliente1.getPassword(), contrahasheada)) {
            System.out.println("Contrasenia correcta");
        } else {
            System.out.println("Contrasenia incorrecta");
        }
    }        
}
