package com.example.PracticandoSpring.Examen.model;

import com.example.PracticandoSpring.Utils.TipoExamen;
import jakarta.persistence.*;

@Table
@Entity(name = "examen")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",columnDefinition = "VARCHAR(30)")
    private String nombre;

    @Column(name = "tipoExamen",columnDefinition = "VARCHAR(30)")
    private TipoExamen tipoExamen;

    @Column(name = "status", columnDefinition = "BOOL DEFAULT TRUE")
    private boolean status;

    @Column(name = "observaciones",columnDefinition = "VARCHAR(30)")
    private String observaciones;

    public Examen() {}

    public Examen(Long id, String nombre, TipoExamen tipoExamen, boolean status, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.tipoExamen = tipoExamen;
        this.status = status;
        this.observaciones = observaciones;
    }

    public Examen(String nombre, TipoExamen tipoExamen, boolean status, String observaciones) {
        this.nombre = nombre;
        this.tipoExamen = tipoExamen;
        this.status = status;
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoExamen getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(TipoExamen tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
