package com.dio.santander.controller;

import com.dio.santander.model.Localidade;
import com.dio.santander.service.LocalidadeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/localidade")
@Tag(name = "Localidade")
public class LocalidadeController extends CRUDController<Localidade, LocalidadeService>{
}
