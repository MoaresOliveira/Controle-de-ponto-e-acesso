package com.dio.santander.controller;

import com.dio.santander.model.Movimentacao;
import com.dio.santander.service.MovimentacaoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacao")
@Tag(name = "Movimentacao")
public class MovimentacaoController extends CRUDController<Movimentacao, MovimentacaoService>{
}
