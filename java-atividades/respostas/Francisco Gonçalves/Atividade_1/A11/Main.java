package A11;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "LG";
        tv.volume = 99;
        tv.canal = 5;

        tv.exibirInformacoes();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.mudarCanal(12);
        tv.diminuirVolume();
        tv.exibirInformacoes();
    }
}
