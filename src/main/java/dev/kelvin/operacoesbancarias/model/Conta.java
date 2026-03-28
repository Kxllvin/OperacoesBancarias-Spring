package dev.kelvin.operacoesbancarias.model;

import dev.kelvin.operacoesbancarias.exception.SaldoInsuficienteException;
import java.math.BigDecimal;

public class Conta {

    private BigDecimal saldo;

    public Conta(BigDecimal saldoInicial) {
        if (saldoInicial.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void depositar(BigDecimal valor){
        validarValor(valor);

        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor){
        validarValor(valor);

        if (valor.compareTo(saldo) > 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        
        saldo = saldo.subtract(valor);
    }

    private void validarValor(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
    }

}
