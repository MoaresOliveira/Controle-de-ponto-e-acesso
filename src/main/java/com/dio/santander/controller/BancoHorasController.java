package com.dio.santander.controller;

import com.dio.santander.model.BancoHoras;
import com.dio.santander.service.BancoHorasService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bhoras")
@Tag(name = "Banco de Horas")
public class BancoHorasController extends CRUDController<BancoHoras, BancoHorasService>{
}
