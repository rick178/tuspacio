package com.tuspacio.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "colaboradores")
@ToString
public class Colaborador {
    @Id
    @Getter @Setter @Column(name="id_colab")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColab;
    @Getter @Setter @Column(name="nombre_colab")
    private String nombreColab;
    @Getter @Setter @Column(name="apellido_pat_colab")
    private String apellidoPatColab;
    @Getter @Setter @Column(name="apellido_mat_colab")
    private String apellidoMatColab;
    @Getter @Setter @Column(name="email_colab")
    private String emailColab;
    @Getter @Setter @Column(name="telefono_colab")
    private String telefonoColab;

}
