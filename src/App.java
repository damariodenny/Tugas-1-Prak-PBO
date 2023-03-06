import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        try { 
        System.out.println("Arsen");
        Scanner input = new Scanner(System.in);
        System.out.println("Jenis musuh : 1. Singa || 2. Cobra");
        int musuh = input.nextInt();

        switch (musuh) {
            case 1:
                System.out.print("Masukkan jenis singa : ");
                input.nextLine();
                String jenis = input.nextLine();
                System.out.print("Masukkan ukuran singa : ");
                String ukuran = input.nextLine();
                System.out.print("Masukkan kill count singa : ");
                int kill = input.nextInt();
                Singa arsenSinga = new Singa(jenis, ukuran, kill);

                System.out.println("Pilih skill singa :");
                System.out.println("1. KILL  ||  2. SURPRISE  ||  3.CHASE ");
                int skill = input.nextInt();
                
                switch (skill) {
                    case 1:
                    arsenSinga.membunuh();
                    break;

                    case 2:
                    arsenSinga.menerkam();
                    break;

                    case 3:
                    arsenSinga.mengejar();
                    break;
                }
                
                break;
            case 2:
                System.out.print("Masukkan jenis cobra : ");
                input.nextLine();
                jenis = input.nextLine();
                System.out.print("Masukkan ukuran cobra : ");
                ukuran = input.nextLine();
                System.out.print("Masukkan kill count cobra : ");
                kill = input.nextInt();
                Cobra arsenCobra = new Cobra(jenis, ukuran, kill);

                System.out.println("Pilih skill cobra :");
                System.out.println("1. KILL  ||  2. SURPRISE  ||  3.CHASE ");
                skill = input.nextInt();
                
                switch (skill) {
                    case 1:
                    arsenCobra.membunuh();
                    break;

                    case 2:
                    arsenCobra.menerkam();
                    break;

                    case 3:
                    arsenCobra.mengejar();
                    break;
                }
            default:
                break;
        } 
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
    }
}
