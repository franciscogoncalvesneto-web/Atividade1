package A13;
public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado " + marca + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado " + marca + " desligado.");
    }

    public void aumentarTemperatura() {
        if (ligado) {
            if (temperatura < 30) {
                temperatura++;
                System.out.println("Temperatura aumentada para: " + temperatura + "°C");
            } else {
                System.out.println("Temperatura máxima atingida (30°C)!");
            }
        } else {
            System.out.println("Aparelho desligado! Ligue primeiro.");
        }
    }

    public void diminuirTemperatura() {
        if (ligado) {
            if (temperatura > 16) {
                temperatura--;
                System.out.println("Temperatura diminuída para: " + temperatura + "°C");
            } else {
                System.out.println("Temperatura mínima atingida (16°C)!");
            }
        } else {
            System.out.println("Aparelho desligado! Ligue primeiro.");
        }
    }

    public static void main(String[] args) {
        ArCondicionado ac = new ArCondicionado();
        ac.marca = "Gree";
        ac.temperatura = 17;

        ac.ligar();
        ac.diminuirTemperatura();
        ac.diminuirTemperatura(); // Teste do limite mínimo (16°C)
        ac.aumentarTemperatura();
        ac.desligar();
    }
}
