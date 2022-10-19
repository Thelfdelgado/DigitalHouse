package com.aula41.FilmeException.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //Trata todos os erros
public class GlobalException {
    @ExceptionHandler //Utiliza essa configuracao para tratar o erro
    public ResponseEntity<String> processarErroNotFound(ResourceNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage() + " Global...");
    }
}
