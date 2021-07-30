package com.dio.santander.controller;

import com.dio.santander.model.JornadaTrabalho;
import com.dio.santander.service.JornadaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
@Tag(name = "Jornada de Trabalho")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    @Operation(summary = "Adiciona uma Jornada de Trabalho (ID not required)")
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.save(jornadaTrabalho);
    }
    @GetMapping
    @Operation(summary = "Retorna uma lista de todas Jornadas de Trabalho (ID not required)")
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    @Operation(summary = "Retorna uma Jornada de Trabalho especificada pelo ID")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) {
        return  ResponseEntity.of(jornadaService.findById(idJornada));

    }

    @PutMapping
    @Operation(summary = "Atualiza uma Jornada de Trabalho")
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.update(jornadaTrabalho);
    }
    @DeleteMapping("/{idJornada}")
    @Operation(summary = "Apaga uma Jornada de Trabalho especificada pelo ID")
    public void deleteJornada(@PathVariable("idJornada") Long idJornada){
        jornadaService.delete(idJornada);
    }



}
