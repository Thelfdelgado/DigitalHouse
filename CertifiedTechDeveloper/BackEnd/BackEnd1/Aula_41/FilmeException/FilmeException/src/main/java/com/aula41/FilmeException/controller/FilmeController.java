package com.aula41.FilmeException.controller;

import com.aula41.FilmeException.exception.BadRequestException;
import com.aula41.FilmeException.exception.ResourceNotFoundException;
import com.aula41.FilmeException.model.FilmeModel;
import com.aula41.FilmeException.service.FilmeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    private final FilmeService service;

    public FilmeController(FilmeService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<FilmeModel> saveMovie(@RequestBody FilmeModel filmeModel) throws BadRequestException {
        return ResponseEntity.ok(service.salvar(filmeModel));
    }

    @GetMapping("/findAll")
    public List<FilmeModel> findAllMovies(){
        return service.buscarTodos();
    }

    @GetMapping("/findId/{id}")
    public ResponseEntity<FilmeModel> findMovieById(@PathVariable Integer id) throws ResourceNotFoundException {
        try {
            return ResponseEntity.ok(service.buscarPorId(id));
        }catch (Exception e){
            throw new ResourceNotFoundException("Filme nao encontrado: " + id);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<FilmeModel> updateMovie(@RequestBody FilmeModel filmeModel){
        return ResponseEntity.ok(service.atualizar(filmeModel));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteMovie(@PathVariable Integer id) throws ResourceNotFoundException {
        try {
            service.deletar(id);
            return ResponseEntity.ok("Deletado!");
        }catch (Exception e){
            throw new ResourceNotFoundException("Filme nao encontrado!");
        }
    }

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<String> processarErrorBadRequest(BadRequestException ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
