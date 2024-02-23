import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {

        String nama;
        String gender;
        String umur;
        Scanner scan = new Scanner(System.in);


        System.out.print("Nama :");
        nama = scan.nextLine();
        System.out.print("Jenis Kelamin (L/P):");
        gender = scan.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd):");
        umur = scan.nextLine();
        LocalDate dob = LocalDate.parse(umur);

        LocalDate now = LocalDate.now();
        Period umurmu = Period.between(dob, now);


        System.out.println("Nama Saya : " + nama);
        System.out.print("jenis kelamin : " );

        if (gender.equalsIgnoreCase  ("P")){
            System.out.println ("PEREMPUAN");
        }else if (gender.equalsIgnoreCase ("L")){
            System.out.println ("LAKI LAKI");
        }else{
            System.out.println("(tidak diketahui!!!)");
        }

        System.out.println("Umur Anda :" + umurmu.getYears() + " tahun " + umurmu.getMonths() + " bulan");




    }
}
