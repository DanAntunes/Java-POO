package Polimorfismo;

public class MSNMessenger extends Polimorfismo.ServicoMensagemInstantanea {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo MSN Messenger");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Messenger");
  }

  public void salvarHistoricoMensagem() {
    System.out.println("Salvando histórico de mensagens do MSN Messenger");
  }
}
