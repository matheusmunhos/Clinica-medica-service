package com.munhosdev.clinica_medica.controller;

import com.munhosdev.clinica_medica.domain.Medico;
import com.munhosdev.clinica_medica.domain.dto.MedicoDTO;
import com.munhosdev.clinica_medica.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private final MedicoService service;

    @Autowired
    public MedicoController(MedicoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Medico> cadastrar(@RequestBody MedicoDTO medico){
        return ResponseEntity.ok(this.service.cadastrar(medico));
    }

    @GetMapping
    public ResponseEntity<List<Medico>> buscarMedicos (){
        return ResponseEntity.ok(this.service.buscarMedicos());
    }
}
