package com.dio.santander.controller;

import com.dio.santander.model.CategoriaUsuario;
import com.dio.santander.service.CategoriaUsuarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
@Tag(name = "Categoria de Usuario")
public class CategoriaUsuarioController extends CRUDController<CategoriaUsuario,CategoriaUsuarioService>{
}
