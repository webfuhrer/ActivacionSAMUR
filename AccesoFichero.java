/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosamur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
class AccesoFichero {

    static ArrayList<Activacion> leerActivaciones() {
        ArrayList<Activacion> lista=new ArrayList<Activacion>();
        File archivo =new File("C:\\Users\\NOX218\\Downloads\\activaciones_samur_2019.csv");
        try {
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();//Esta primera fila solo tiene los nombres de los campos
            linea=br.readLine();
            while(linea!=null)
            {
                //Parto linea
                String[] datos=linea.split(";");
                String hora_solicitud=datos[2];
                String hora_intervencion=datos[3];
                String codigo=datos[4];
                //Construyo objeto
                Activacion a=new Activacion(hora_solicitud, hora_intervencion, codigo);
                //Meto objeto en AL
                lista.add(a);
                //Vuelvo a leer linea
                linea=br.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    static void grabarHTML(String html_tabla, String html_lista) {
       String html="<html><head></head><body>";
       html+=html_tabla;
       html+="<br>";
       html+=html_lista;
       html+="</body></html>";
        try {
            FileWriter fw=new FileWriter("C:\\LUIS\\html_samur.html");
            fw.write(html);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
