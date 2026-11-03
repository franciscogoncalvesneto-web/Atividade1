package A11;
public class Televisao {
    String marca;
    int volume;
    int canal;

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume máximo atingido (100)!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume mínimo atingido (0)!");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Canal inválido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("TV " + marca + " | Canal: " + canal + " | Volume: " + volume);
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "LG";
        tv.volume = 99;
        tv.canal = 5;

        tv.exibirInformacoes();
        tv.aumentarVolume();
        tv.aumentarVolume(); // Teste do limite máximo
        tv.mudarCanal(12);
        tv.diminuirVolume();
        tv.exibirInformacoes();
    }
}
