package com.munhosdev.clinica_medica.domain;


import com.munhosdev.clinica_medica.domain.dto.MedicoDTO;
import com.munhosdev.clinica_medica.enums.Especialidades;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "medicos")
public class Medico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, unique = true, nullable = false)
    private String cpf;

    @NotBlank(message = "Nome do médico não pode estar vazio.")
    private String nome;
    @NotBlank(message = "CRM do médico não pode estar vazio")
    private String crm;
    @Enumerated(EnumType.STRING)
    private Especialidades especialidade;


    public Medico (MedicoDTO dto){
        this.cpf = dto.cpf();
        this.nome = dto.nome();
        this.crm = dto.crm();
        this.especialidade = dto.especialidade();
    }

}
