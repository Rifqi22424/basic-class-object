class KonversiSuhu{
    String jenisSuhu;
    double nilaiSuhu;

    public KonversiSuhu(String jenisSuhu, double nilaiSuhu) {
        this.jenisSuhu = jenisSuhu;
        this.nilaiSuhu = nilaiSuhu;
    }

    public void getNilaiSuhuTo() {
        if (jenisSuhu.equals("reamur")) {
            convertAndPrint("celcius", nilaiSuhu * 5.0/4.0);
            convertAndPrint("fahrenheit", nilaiSuhu * 9.0/4.0 + 32.0);
            convertAndPrint("kelvin", nilaiSuhu * 5.0/4.0 + 273);
        } else if (jenisSuhu.equals("celcius")) {
            convertAndPrint("reamur", nilaiSuhu * 4.0/5.0);
            convertAndPrint("fahrenheit", nilaiSuhu * 9.0/4.0 + 32.0);
            convertAndPrint("kelvin", nilaiSuhu * 5.0/4.0 + 273);
        } else if (jenisSuhu.equals("fahrenheit")) {
            convertAndPrint("celcius", (nilaiSuhu - 32.0) * 4.0/9.0);
            convertAndPrint("reamur", (nilaiSuhu - 32.0) * 4.0/9.0);
            convertAndPrint("kelvin", (nilaiSuhu - 32.0) * 4.0/9.0 + 273);
        } else if (jenisSuhu.equals("kelvin")) {
            convertAndPrint("celcius", (nilaiSuhu - 32.0) * 4.0/5.0);
            convertAndPrint("reamur", (nilaiSuhu - 273) * 4.0/5.0);
            convertAndPrint("fahrenheit", (nilaiSuhu + 32.0) * 9.0/4.0);
        }
    }

    private void convertAndPrint(String targetSuhu, double nilaiSuhu) {
        System.out.println(targetSuhu + ": " + nilaiSuhu);
    }
}

class UmurSekarang{
    int tahunSekarang = 2024;
    int tahunLahir;
    int umurSekarang;

    public UmurSekarang(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public void getUmurSekarang() {
        umurSekarang = tahunSekarang - tahunLahir;
        System.out.println("Umur anda sekarang adalah " + umurSekarang);
    }
}

class Segitiga{
    int alas;
    int sisiKiri;
    int sisiKanan;
    int tinggi;
    int kelilingSegitiga;
    double luasSegitiga;

    public Segitiga(int alas, int sisiKiri, int sisiKanan, int tinggi) {
        this.alas = alas;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
        this.tinggi = tinggi;
    }

    public void getKelilingSegitiga() {
        kelilingSegitiga = alas + sisiKiri + sisiKanan;
        System.out.println("Keliling segitiganya adalah: " + kelilingSegitiga);
    }

    public void getLuasSegitiga() {
        luasSegitiga = 1.00/2 * alas * tinggi;
        System.out.println("Luas segitiganya adalah " + luasSegitiga);
    }
}


public class App {

    public static void main(String[] args) {
        System.out.println("\t");
        KonversiSuhu konversiSuhu = new KonversiSuhu("celcius", 12);
        konversiSuhu.getNilaiSuhuTo();
        System.out.println("\t");

        UmurSekarang umurSekarang = new UmurSekarang(2004);
        umurSekarang.getUmurSekarang();
        System.out.println("\t");

        Segitiga segitiga = new Segitiga(10, 10, 10, 8);
        segitiga.getKelilingSegitiga();
        segitiga.getLuasSegitiga();
        System.out.println("\t");
    }
}