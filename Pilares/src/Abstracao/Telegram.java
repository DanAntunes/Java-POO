package Abstracao;

public class Telegram extends Abstracao.ServicoPai {
  public void enviarMensagem() {
    System.out.println("Enviando mensagem pelo Telegram");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Telegram");
  }
}
