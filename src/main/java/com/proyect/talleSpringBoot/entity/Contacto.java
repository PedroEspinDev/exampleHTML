package com.proyect.talleSpringBoot.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fechaNacimiento;

    private LocalDateTime fechaRegistro;

    @PrePersist
    private void asignarFechaRegistro() {
        fechaRegistro = LocalDateTime.now();
    }
}
