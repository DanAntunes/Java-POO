package Abstracao;

public class MSNMessenger extends Abstracao.ServicoPai {
  public void enviarMensagem() {
    System.out.println("Enviando mensagem pelo MSN Messenger");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Messenger");
  }
}
