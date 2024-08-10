package com.munhosdev.clinica_medica.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "prontuarios")
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    @OneToOne
    private Medico medicoResponsavel;

    @ManyToOne
    @JoinColumn(name = "paciente_cpf")
    private Paciente paciente;

}
