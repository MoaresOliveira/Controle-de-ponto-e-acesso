package com.dio.santander.controller;

import com.dio.santander.model.Calendario;
import com.dio.santander.service.CalendarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calendario")
@Tag(name = "Calendario")
public class CalendarioController extends CRUDController<Calendario, CalendarioService>{
}
