package com.dio.santander.controller;

import com.dio.santander.model.TipoData;
import com.dio.santander.service.TipoDataService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
@Tag(name = "Tipo de Data")
public class TipoDataController extends CRUDController<TipoData, TipoDataService>{
}
