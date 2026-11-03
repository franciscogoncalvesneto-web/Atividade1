package A13;

public class Main {
    public static void main(String[] args) {
        ArCondicionado ac = new ArCondicionado();
        ac.marca = "Gree";
        ac.temperatura = 17;

        ac.ligar();
        ac.diminuirTemperatura();
        ac.diminuirTemperatura();
        ac.aumentarTemperatura();
        ac.desligar();
    }
}
