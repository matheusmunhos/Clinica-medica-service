package com.munhosdev.clinica_medica.repositories;

import com.munhosdev.clinica_medica.domain.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico,Long> {

    Medico findMedicoByCpf(String cpf);
    Medico findMedicoByCrm(String crm);
}
