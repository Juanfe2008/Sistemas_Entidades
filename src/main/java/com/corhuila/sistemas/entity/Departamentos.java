package com.corhuila.sistemas.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "departamentos")
public class Departamentos implements Serializable {


    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "nombre", nullable = false)
    private String Nombre;

    @Column(name = "estado", nullable = false)
    private Boolean Estado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "pais_id", nullable = false)
    private Paises PaisId;


    public Paises getPaisId() {
        return PaisId;
    }

    public void setPaisId(Paises paisId) {
        PaisId = paisId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
