import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Not ortalama hesaplama proğramına hoş geldiniz.");
        Scanner imput = new Scanner(System.in);
        int mat, fizik, kimya, türkce, tarih, müzik, ortalama;

        // Notları isteyelim kullanıcıdan
        System.out.println("Lütfen Mat notunuzu Giriniz");
        mat = imput.nextInt();
        System.out.println("Lütfen Fizik notunuzu Giriniz");
        fizik = imput.nextInt();
        System.out.println("Lütfen Kimya notunuzu Giriniz");
        kimya = imput.nextInt();
        System.out.println("Lütfen Türkçe notunuzu Giriniz");
        türkce = imput.nextInt();
        System.out.println("Lütfen Tarih notunuzu Giriniz");
        tarih = imput.nextInt();
        System.out.println("Lütfen Müzik notunuzu Giriniz");
        müzik = imput.nextInt();
        ortalama = (mat + fizik + kimya + türkce + tarih + müzik) / 6;
        System.out.println("Notlarınızın Ortalaması : " + ortalama);
        boolean sınıfDurumu=ortalama>=60;
        System.out.println("Durum = "+(sınıfDurumu==true ? "Geçti" : "Kaldı"));


    }
}