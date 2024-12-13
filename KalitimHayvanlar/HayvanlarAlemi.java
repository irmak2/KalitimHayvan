package ornekbabasi;

public class HayvanlarAlemi {
    private String üremeSekli;
    private int herbirininSayisi;
    private String  hayvanFamilyası;

     public void Üreme(){
       System.out.println("Hayvan ürüyor.");
    }
    public void beslenme(){
        System.out.println("Hayvan besleniyor.");
    }
    public void hareket(){
        System.out.println("Hayvan hareket ediyor.");
    }
    public void ölüm(){
        System.out.println("Hayvan vefat etti.");
    }
    public String getÜremeSekli() {
        return üremeSekli;
    }

    public void setÜremeSekli(String üremeSekli) {
        this.üremeSekli = üremeSekli;
    }

    public int getHerbirininSayisi() {
        return herbirininSayisi;
    }

    public void setHerbirininSayisi(int herbirininSayisi) {
        this.herbirininSayisi = herbirininSayisi;
    }

    public String getHayvanFamilyası() {
        return hayvanFamilyası;
    }

    public void setHayvanFamilyası(String hayvanFamilyası) {
        this.hayvanFamilyası = hayvanFamilyası;
    }
}
