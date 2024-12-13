package ornekbabasi;

public class DenizAnasi extends HayvanlarAlemi {
    public int vücutSuOrani;
    public String beyinDurumu;
    public String savunmaDurumu;

    public void yenidenDoguyor(){
        System.out.println("Olgun medüz polip evresine dönüp ölümsüz oluyor.");

    }

    @Override
    public void Üreme() {
        super.Üreme();
        System.out.println("Hem eşeyli hem de eşeysiz üreme yapiyor.");
    }

    @Override
    public void hareket() {
        super.hareket();
        System.out.println("Deniz anasi suda hareket eder.");
    }
}
