package com.dio.santander.controller;

import com.dio.santander.model.NivelAcesso;
import com.dio.santander.service.NivelAcessoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acesso")
@Tag(name = "Nivel de Acesso do Usuario")
public class NivelAcessoController{

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    @Operation(summary = "Adiciona um Nivel de Acesso (ID not required)")
    public NivelAcesso create(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.save(nivelAcesso);
    }

    @GetMapping("/{idAcesso}")
    @Operation(summary = "Retorna um Nivel de Acesso especificado pelo ID")
    public Optional<NivelAcesso> getById(@PathVariable("idAcesso") Long idAcesso) {
        return nivelAcessoService.findById(idAcesso);
    }

    @GetMapping
    @Operation(summary = "Retorna uma lista com todos Niveis de Acesso (ID not required)")
    public List<NivelAcesso> getAll() {
        return nivelAcessoService.findAll();
    }

    @PutMapping
    @Operation(summary = "Atualiza um Nivel de Acesso")
    public NivelAcesso update(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.save(nivelAcesso);
    }

    @DeleteMapping("/{idAcesso}")
    @Operation(summary = "Apaga um Nivel de Acesso especificado por ID")
    public void delete(@PathVariable("idAcesso") Long idAcesso) {
        nivelAcessoService.delete(idAcesso);
    }


}
