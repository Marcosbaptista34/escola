package com.marcos.escola.controller;

import com.marcos.escola.dto.EscolaDTO;
import com.marcos.escola.services.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "escola")
public class EscolaController {

    @Autowired
    public EscolaService escolaService;

    @GetMapping 
    public List<EscolaDTO> listaEscola(){
        return escolaService.getListaEscola();

    }

}
