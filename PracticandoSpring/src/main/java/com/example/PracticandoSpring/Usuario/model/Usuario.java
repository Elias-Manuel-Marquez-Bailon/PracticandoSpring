package com.example.PracticandoSpring.Usuario.model;

import com.example.PracticandoSpring.Utils.Rol;
import jakarta.persistence.*;

@Table
@Entity(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",columnDefinition = "VARCHAR(30)")
    private String nombre;

    @Column(name = "password",columnDefinition = "VARCHAR(30)")
    private String password;

    @Column(name = "rol",columnDefinition = "VARCHAR(30)")
    private Rol rol;

    public Usuario() {}

    public Usuario(Long id, String nombre, String password, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
