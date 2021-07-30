package com.dio.santander.controller;

import com.dio.santander.model.Ocorrencia;
import com.dio.santander.service.OcorrenciaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ocorrencia")
@Tag(name = "Ocorrencias")
public class OcorrenciaController extends CRUDController<Ocorrencia, OcorrenciaService> {
}
