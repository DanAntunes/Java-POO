package Geral;

public class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.setChassi("1902122");
    jeep.ligar();

    Moto z500 = new Moto();
    z500.setChassi("1231231");
    z500.ligar();

    Veiculo joker = jeep;
    joker.ligar();
  }
}