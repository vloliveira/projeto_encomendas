package com.chegouAqui.encomendas.repository;

import com.chegouAqui.encomendas.entity.Encomendas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncomendasRepository extends JpaRepository<Encomendas, Long> {
}
