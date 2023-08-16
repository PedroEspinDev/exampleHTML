package com.proyect.talleSpringBoot.repository;

import com.proyect.talleSpringBoot.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {

}
