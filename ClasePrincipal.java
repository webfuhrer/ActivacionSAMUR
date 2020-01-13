/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosamur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Activacion> lista_activaciones=AccesoFichero.leerActivaciones();
        HashMap<String, Integer> mapa_ocurrencias=new HashMap();
        for(Activacion a: lista_activaciones)
        {
            String codigo=a.getCodigo();
            if (mapa_ocurrencias.containsKey(codigo))
            {
                int n=mapa_ocurrencias.get(codigo);
                n=n+1;
                mapa_ocurrencias.replace(codigo, n);
            }
            else
            {
                mapa_ocurrencias.put(codigo, 1);
            }
        }
        Set codigos=mapa_ocurrencias.keySet();
        
        Iterator i=codigos.iterator();
       
        while(i.hasNext())
        {
            String codigo=(String)i.next();
            System.out.println(codigo+" "+mapa_ocurrencias.get(codigo));
        }
           String html_tabla=CreaHTML.crearTabla(lista_activaciones);
           String html_lista=CreaHTML.crearListaDesordenada(mapa_ocurrencias);
           AccesoFichero.grabarHTML(html_tabla, html_lista);
           
        
    }
}
