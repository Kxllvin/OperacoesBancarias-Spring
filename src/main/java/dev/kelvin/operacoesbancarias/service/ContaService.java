package dev.kelvin.operacoesbancarias.service;

import java.math.BigDecimal;
import dev.kelvin.operacoesbancarias.model.Conta;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    private Conta conta = new Conta(BigDecimal.ZERO);

    public void depositar(BigDecimal valor) {
        conta.depositar(valor);
    }

    public void sacar(BigDecimal valor) {
        conta.sacar(valor);
    }

    public BigDecimal consultarSaldo() {
        return conta.getSaldo();
    }
}

