package com.dio.santander.controller;

import com.dio.santander.model.JornadaTrabalho;
import com.dio.santander.service.JornadaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jornada")
@Tag(name = "Jornada de Trabalho")
public class JornadaTrabalhoController extends CRUDController<JornadaTrabalho,JornadaService>{
}
