package Polimorfismo;

public class Telegram extends Polimorfismo.ServicoMensagemInstantanea {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo Telegram");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Telegram");
  }

  public void salvarHistoricoMensagem() {
    System.out.println("Salvando histórico de mensagens do Telegram");
  }
}
