package com.fiap.cerveja.controller;

import com.fiap.cerveja.domain.Tipo;
import com.fiap.cerveja.dto.CervejaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("cervejas")
public class CervejaController {

    @GetMapping
    public List<CervejaDTO> buscarCervejas(){
        CervejaDTO cervejaDTO1 = new CervejaDTO();
        cervejaDTO1.setId(1L);
        cervejaDTO1.setNome("Baden Baden");
        cervejaDTO1.setTipo(Tipo.WEISS);
        cervejaDTO1.setVencimento(LocalDate.of(2022, 6, 30));

        CervejaDTO cervejaDTO2 = new CervejaDTO();
        cervejaDTO2.setId(2L);
        cervejaDTO2.setNome("Colonia");
        cervejaDTO2.setTipo(Tipo.PILSEN);
        cervejaDTO2.setVencimento(LocalDate.of(2022, 2, 15));

        return Arrays.asList(cervejaDTO1, cervejaDTO2);
    }

}
