import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuNumber = 0;
        int counterStudent = 0;
        String name, age, major;
        String[][] students = new String[5][3];

        do {
            System.out.println("--------------------------------------");
            System.out.println("Main Menu");
            System.out.println("--------------------------------------");
            System.out.println("1. Add Mahasiswa");
            System.out.println("2. Delete Mahasiswa");
            System.out.println("3. View All Mahasiswa");
            System.out.println("4. Exit");
            System.out.print("Masukkan menu yang dipilih : ");
            menuNumber = scan.nextInt();
            scan.nextLine();
        } while (menuNumber < 1 || menuNumber > 4);

    }
}
