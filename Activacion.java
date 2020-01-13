/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectosamur;

/**
 *
 * @author CDMFP
 */
public class Activacion {
    private String hora_solicitud, hora_intervencion, codigo;

    public Activacion(String hora_solicitud, String hora_intervencion, String codigo) {
        this.hora_solicitud = hora_solicitud;
        this.hora_intervencion = hora_intervencion;
        this.codigo = codigo;
    }

    public String getHora_solicitud() {
        return hora_solicitud;
    }

    public String getHora_intervencion() {
        return hora_intervencion;
    }

    public String getCodigo() {
        return codigo;
    }
    
}
