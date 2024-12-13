package ornekbabasi;

public class İnek extends HayvanlarAlemi{
    public String mide;
    public String arkadas;
    public String yogurt;

    public void sutSagma(){
        System.out.println("ineğin sütü sağılıyor...");
    }

    @Override
    public void Üreme() {
        super.Üreme();
        System.out.println("Yalnız eşeyli üreme yapıyor.");
    }

    @Override
    public void hareket() {
        super.hareket();
        System.out.println("İnekler karada hareket eder.");
    }
}

