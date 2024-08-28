package Hamburgueria;

import Hamburgueria.Area.Cliente.Cliente;
import Hamburgueria.Atendimento.Atendente;
import Hamburgueria.Atendimento.Cozinha.Almoxarife;
import Hamburgueria.Atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {
  public static void main(String[] args) {
    Cozinheiro cozinheiro = new Cozinheiro();
    // ações que estabelecimento precisa ter ciência
    cozinheiro.adicionarSucoNoBalcao();
    ;
    cozinheiro.adicionarLancheNoBalcao();
    cozinheiro.adicionarComboNoBalcao();

    Almoxarife almoxarife = new Almoxarife();

    Atendente atendente = new Atendente();
    atendente.receberPagamento();
    atendente.servindoMesa();

    Cliente cliente = new Cliente();
    cliente.escolherLanche();
    cliente.fazerPedido();
    cliente.pagarConta();

    // não deveria, mas o estabelecimento
    // ainda não definiu normas de atendimento

    // esta ação é muito sigilosa, qua tal ser privada ?

    // já pensou os clientes ouvindo que o gás acabou ?

  }
}