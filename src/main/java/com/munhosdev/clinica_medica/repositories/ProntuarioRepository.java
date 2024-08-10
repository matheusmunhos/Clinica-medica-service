package com.munhosdev.clinica_medica.repositories;

import com.munhosdev.clinica_medica.domain.Prontuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
}
