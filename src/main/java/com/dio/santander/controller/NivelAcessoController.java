package com.dio.santander.controller;

import com.dio.santander.model.NivelAcesso;
import com.dio.santander.service.NivelAcessoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acesso")
@Tag(name = "Nivel de Acesso do Usuario")
public class NivelAcessoController extends CRUDController<NivelAcesso,NivelAcessoService>{
}
