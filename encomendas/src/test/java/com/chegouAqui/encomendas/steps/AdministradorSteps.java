package com.chegouAqui.encomendas.steps;

import io.cucumber.java.pt.Dado;


import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AdministradorSteps {
    @Dado("que existem usuários cadastrados no sistema:")
    public void que_existem_usuários_cadastrados_no_sistema(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Quando("faço uma requisição GET para administradores")
    public void faço_uma_requisição_get_para_administradores() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("o status code da resposta deve ser {int}")
    public void o_status_code_da_resposta_deve_ser(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}