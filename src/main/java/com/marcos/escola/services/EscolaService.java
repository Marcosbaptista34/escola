package com.marcos.escola.services;

import com.marcos.escola.dto.EscolaDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EscolaService {
    public List<EscolaDTO> getListaEscola (){

        EscolaDTO escolaDTO = new EscolaDTO();
        escolaDTO.setId("1");
        escolaDTO.setName("Inah");

        EscolaDTO escolaDTO1 = new EscolaDTO();
        escolaDTO1.setId("2");
        escolaDTO1.setName("Aschar");

        List<EscolaDTO> listaEscola = new ArrayList<>();
        listaEscola.add(escolaDTO);
        listaEscola.add(escolaDTO1);


        return listaEscola;
    }
}
