package com.munhosdev.clinica_medica.service;

import com.munhosdev.clinica_medica.domain.Medico;
import com.munhosdev.clinica_medica.domain.dto.MedicoDTO;
import com.munhosdev.clinica_medica.exceptions.MedicoCadastradoException;
import com.munhosdev.clinica_medica.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicoService {

    private final MedicoRepository repository;

    @Autowired
    public MedicoService(MedicoRepository repository) {
        this.repository = repository;
    }

    public Medico cadastrar(MedicoDTO medicoDTO){
      Medico novoMedico = new Medico(medicoDTO);
      if(Boolean.TRUE.equals(validar(medicoDTO))){
          repository.save(novoMedico);
      }
       return novoMedico;
    }

    public List<Medico> buscarMedicos(){
     return this.repository.findAll();
    }

    public Boolean validar(MedicoDTO medicoDTO){
        Medico validationCPF = this.repository.findMedicoByCpf(medicoDTO.cpf());
        Medico validationCRM = this.repository.findMedicoByCrm(medicoDTO.crm());
        if(validationCPF != null){
            throw new MedicoCadastradoException(validationCPF.getCpf());
        } else if (validationCRM != null) {
            throw new MedicoCadastradoException(medicoDTO.crm());
        }
        return true;
    }
}