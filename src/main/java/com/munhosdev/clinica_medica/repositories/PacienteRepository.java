package com.munhosdev.clinica_medica.repositories;

import com.munhosdev.clinica_medica.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, String> {
}
