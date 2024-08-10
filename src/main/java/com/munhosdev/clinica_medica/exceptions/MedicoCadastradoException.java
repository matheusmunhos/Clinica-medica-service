package com.munhosdev.clinica_medica.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class MedicoCadastradoException extends RuntimeException {


    public MedicoCadastradoException(String message) {
        super("Médico com CPF/CRM: "+message+" já cadastrado.");
    }

    public MedicoCadastradoException() {
        super();
    }
}
