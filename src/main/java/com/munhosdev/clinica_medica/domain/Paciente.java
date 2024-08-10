package com.munhosdev.clinica_medica.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @NotBlank(message = "CPF do paciente não pode estar vazio")
    private String cpf;
    @NotBlank(message = "Nome do paciente não pode estar vazio")
    private String nome;
    @NotNull(message = "Data de nascimento do paciente não pode estar vazio.")
    private Date dataNascimento;

    @OneToMany(mappedBy = "paciente")
    private List<Prontuario> prontuarios;

}
