/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author y-ose
 */
public class Consulta {
    static Connection conexion=null;
    static Statement sentencia;
    static ResultSet resultado;
    static ResultSetMetaData resultadometa;
    public static void conectar(){
        //private static final String driver="org.postgresql.Driver";
        String ruta="jdbc:postgresql://localhost/InventarioPrueba";
        String user="YoselinLara";
        String pass="UACM";
        try {
            Class.forName("org.postgresql.Driver");
            conexion=DriverManager.getConnection(ruta,user,pass); 
            sentencia= conexion.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("No conectado");
        }
    }
    public static ArrayList<Object[]> llenar_tabla(String sql){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        //String sql = "SELECT * FROM pelicula";
        try {
            resultado=sentencia.executeQuery(sql);
            resultadometa= resultado.getMetaData();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto  "+e.toString());
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }
 /*public static ArrayList<Object[]> buscar_tabla(String Nombre){
        ArrayList<Object[]> datos = new ArrayList<Object[]>();
        String q = "SELECT * FROM Datos" + " WHERE Nombre='"+Nombre+"'";
        try {
            resultado=sentencia.executeQuery(q);
            resultadometa= resultado.getMetaData();
            System.out.println("Correcto");
        } catch (Exception e) {
            System.out.println("No Correcto");
        }
        try {
            while(resultado.next()){
                Object[] filas = new Object[resultadometa.getColumnCount()];
                for(int i = 0;i<resultadometa.getColumnCount();i++){
                    filas[i]= resultado.getObject(i+1);
                }
                datos.add(filas);
            }
        } catch (Exception e) {
        }
        return datos;
    
    }*/
}
