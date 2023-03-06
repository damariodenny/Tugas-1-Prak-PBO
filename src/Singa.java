public class Singa extends Musuh implements Sifat{
boolean beranak = true;

    public Singa(String jenis, String ukuran, int kill) {
    super(jenis, ukuran, kill);
    System.out.println("Singa dengan jenis " +jenis+ " dengan ukuran " +ukuran+ " dengan total korban " +kill+ " telah terinput");
}

    @Override
    public void membunuh() {
        // TODO Auto-generated method stub
        System.out.println("SINGA TELAH MEMBUNUH ANDA");
    }

    @Override
    public void mengejar() {
        // TODO Auto-generated method stub
        System.out.println("SINGA TELAH MENGEJAR ANDA");
    }

    @Override
    public void menerkam() {
        // TODO Auto-generated method stub
        System.out.println("SINGA TELAH MENERKAM ANDA");
    }
    
}