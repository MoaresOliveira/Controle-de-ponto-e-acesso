package com.dio.santander.controller;

import com.dio.santander.model.Empresa;
import com.dio.santander.service.EmpresaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
@Tag(name = "Empresa")
public class EmpresaController extends CRUDController<Empresa, EmpresaService>{
}
