package com.munhosdev.clinica_medica.domain.dto;

import com.munhosdev.clinica_medica.enums.Especialidades;

public record MedicoDTO(
        String cpf,
        String nome,
        String crm,
        Especialidades especialidade

) {
}
