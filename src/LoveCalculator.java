import java.util.Random;
import java.util.Scanner;

public class LoveCalculator {

    public static void main(String[] args) {
        String NamaAnda, NamaPasangan, ENTER;
        Integer UmurAnda, UmurPasangan, x;
        float y, Cocok;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println("Data Anda:");
        System.out.println("❤❤❤❤❤❤");
        System.out.print("Masukkan Nama Anda    :");
        NamaAnda = userInput.nextLine();
        System.out.print("Masukkan Umur Anda    :");
        UmurAnda = Integer.parseInt(userInput.nextLine());
        System.out.println(" ");

        System.out.println("Data Pasangan Anda :");
        System.out.println("❤❤❤❤❤❤❤❤❤");
        System.out.print("Masukkan Nama Pasangan Anda   :");
        NamaPasangan = userInput.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda   :");
        UmurPasangan = Integer.parseInt(userInput.nextLine());
        System.out.println(" ");

        System.out.println("  " + NamaAnda + " [" + UmurAnda + "] tahun");
        System.out.println("     ❤❤      ❤❤  ");
        System.out.println("  ❤❤❤❤   ❤❤❤❤   ");
        System.out.println(" ❤❤❤❤❤❤❤❤❤❤  ");
        System.out.println(" ❤❤❤❤❤❤❤❤❤❤   ");
        System.out.println("   ❤❤❤❤❤❤❤❤    ");
        System.out.println("     ❤❤❤❤❤❤      ");
        System.out.println("       ❤❤❤❤      ");
        System.out.println("        ❤❤❤        ");
        System.out.println("          ❤         ");
        System.out.println("  " + NamaPasangan + " [" + UmurPasangan + "] tahun");
        System.out.println(" ");

        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        ENTER = userInput.nextLine();
        System.out.print("Kecocokan Anda dengan Pasangan Anda adalah :");

        Random random = new Random();
        x = random.nextInt(51) + 50;
        y = (float) 1.1;
        Cocok = x/y;
        System.out.println(Cocok + "%");



        System.out.println("Terima kasih karena telah menggunakan jasa ramalan kami.. ^^v");
    }
}
