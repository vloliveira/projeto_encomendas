package com.chegouAqui.encomendas.repository;

import com.chegouAqui.encomendas.entity.Morador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository extends JpaRepository <Morador, Long> {
}
