package com.fiap.cerveja.service;

import com.fiap.cerveja.domain.Tipo;
import com.fiap.cerveja.dto.CervejaCreateOrUpdateDTO;
import com.fiap.cerveja.dto.CervejaDTO;
import com.fiap.cerveja.dto.CervejaVencimentoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CervejaServiceImpl implements CervejaService {

    @Override
    public List<CervejaDTO> getAll(Tipo tipo) {
        return null;
    }

    @Override
    public CervejaDTO getById(Long id) {
        return null;
    }

    @Override
    public CervejaDTO create(CervejaCreateOrUpdateDTO createOrUpdateDTO) {
        return null;
    }

    @Override
    public CervejaDTO update(Long id, CervejaCreateOrUpdateDTO cervejaCreateOrUpdateDTO) {
        return null;
    }

    @Override
    public CervejaDTO updateVencimento(Long id, CervejaVencimentoDTO cervejaVencimentoDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
