public class Cobra extends Musuh implements Sifat{
    boolean beranak = false;

    public Cobra(String jenis, String ukuran, int kill) {
    super(jenis, ukuran, kill);
    System.out.println("Cobra dengan jenis " +jenis+ " dengan ukuran " +ukuran+ " dengan total korban " +kill+ " telah terinput");
    }

    @Override
    public void membunuh() {
        // TODO Auto-generated method stub
        System.out.println("COBRA TELAH MEMBUNUH ANDA");
    }

    @Override
    public void menerkam() {
        // TODO Auto-generated method stub
        System.out.println("COBRA TELAH MENERKAM ANDA");
    }

    @Override
    public void mengejar() {
        // TODO Auto-generated method stub
        System.out.println("COBRA TELAH MENGEJAR ANDA");
    }

    
}
