package aula.controller;

import aula.handler.BusinessException;
import org.springframework.stereotype.Service;

@Service
public class CodigoPostalService {
    public String buscarCidade(String ibge) {
        if (ibge == null || ibge.isEmpty())
            throw new BusinessException("O campo IBGE precisa ser informado");
        else
            return "São Paulo";
    }
}
