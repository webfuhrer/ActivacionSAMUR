/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosamur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author CDMFP
 */
class CreaHTML {

    static String crearTabla(ArrayList<Activacion> lista_activaciones) {
        String tabla="<table class='clase_tabla'>";
        for(Activacion a: lista_activaciones)
        {
            tabla+="<tr><td>"+a.getHora_solicitud()+"</td><td>"+a.getHora_intervencion()+"</td><td>"+
                    a.getCodigo()+"</td></tr>";
        }
        tabla+="</table>";
        return tabla;
    }

    static String crearListaDesordenada(HashMap<String, Integer> mapa_ocurrencias) {
       Iterator it=mapa_ocurrencias.keySet().iterator();
       String lista="<ul>";
       while(it.hasNext())
       {
           String codigo=(String)it.next();
           int n_veces=mapa_ocurrencias.get(codigo);
           lista+="<li>"+codigo+": "+n_veces+" activaciones</li>";
           
       }
    lista+="</ul>";
    return lista;
    }
    
}
