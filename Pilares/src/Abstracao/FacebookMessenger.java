package Abstracao;

public class FacebookMessenger extends Abstracao.ServicoPai {
  public void enviarMensagem() {
    System.out.println("Enviando mensagem pelo Facebook Messenger");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Facebook Messenger");
  }
}
