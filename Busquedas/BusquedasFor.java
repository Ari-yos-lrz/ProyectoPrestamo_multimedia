/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busquedas;

import java.util.regex.Pattern;

/**
 *
 * @author y-ose
 */
public class BusquedasFor {
    public static boolean validaUsuario(String valor){
     return Pattern.matches("[A-Za-z0-9]+[\t]?", valor);
    }
    public static boolean validaContrasena(String valor){
    return Pattern.matches("[A-Za-z0-9]+", valor);
    }
    public static boolean campoVacio(String valor){
     return (valor.trim().isEmpty());
    }
    public static boolean validaTexto(String valor){
    return Pattern.matches("[A-Za-z0-9]+[\t]?", valor);
    }
    public static boolean validaEntero(String valor){
    return Pattern.matches("[0-9]+", valor);
    }
     public static boolean validaDuracion(String valor){
    return Pattern.matches("[0-9]+[.][0-9]+", valor);
    }
}
