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

            // add mahasiswa
            if (menuNumber == 1) {
                boolean isAdded = false;
                do {
                    System.out.println("--------------------------------------");
                    System.out.println("Add Mahasiswa");
                    System.out.println("--------------------------------------");
                    System.out.print("Nama (3-20 Karakter) : ");
                    name = scan.nextLine();
                    System.out.print("Umur (min 17 Tahun) : ");
                    age = scan.nextLine();
                    System.out.print("Jurusan (maks 10 Karakter: ");
                    major = scan.nextLine();
                    System.out.println("--------------------------------------");

                    if ((name.length() >= 3 && name.length() <= 20) && (Integer.parseInt(age) >= 17) && (major.length() <= 10)) {
                        for (int i = 0; i < students.length; i++) {
                            if (students[i][0] == null) {
                                students[i][0] = name;
                                students[i][1] = age;
                                students[i][2] = major;
                                isAdded = true;
                                System.out.println("Data Mahasiswa berhasil ditambahkan");
                                counterStudent++;
                                break;
                            }
                        }
                        if (!isAdded) {
                            System.out.println("Jumlah mahasiswa telah melebihi kapasitas, silahkan hapus minimal satu mahasiswa");
                            isAdded = true;
                        }
                    } else {
                        System.out.println("Data yang dimasukkan tidak valid. Silahkan coba lagi.");
                    }

                } while (!isAdded);
                menuNumber = 0;
            }

            // delete mahasiswa

            if (menuNumber == 2){

                System.out.println("--------------------------------------");
                System.out.println("Delete All Mahasiswa");
                System.out.println("--------------------------------------");

                if (counterStudent != 0){
                    students[counterStudent - 1][0] = null;
                    students[counterStudent - 1][1] = null;
                    students[counterStudent - 1][2] = null;
                    counterStudent--;
                    System.out.println("Mahasiswa yang masuk terakhir didelete");
                    System.out.println("--------------------------------------");
                    System.out.println();
                } else {
                    System.out.println("Daftar mahasiswa kosong, silahkan tambahkan data mahasiswa terlebih dahulu");
                    System.out.println("--------------------------------------");
                    System.out.println();
                }
                menuNumber = 0;
            }

            // view all mahasiswa
            if (menuNumber == 3) {

                System.out.println("--------------------------------------");
                System.out.println("Vie All Mahasiswa");
                System.out.println("--------------------------------------");

                if (students[0][0] != null){
                    for (int i = 0; i < (counterStudent); i++) {
                        System.out.println((i + 1) + ".");
                        System.out.println("Nama: " + students[i][0]);
                        System.out.println("Umur: " + students[i][1]);
                        System.out.println("Jurusan: " + students[i][2]);
                        System.out.println();
                    }
                } else {
                    System.out.println("Daftar Mahasiswa kosong, tambahkan daftar mahasiswa terlebih dahulu");
                }

                System.out.println("--------------------------------------");

                boolean backToMenu = false;

                do {
                    System.out.print("Input angka 0 jika ingin kembali ke Menu atau 4 jika ingin keluar : ");
                    if (scan.hasNextInt()){
                        menuNumber = scan.nextInt();
                        scan.nextLine();
                        if (menuNumber != 0 && menuNumber != 4){
                            backToMenu = false;
                            System.out.println("Input tidak valid. Masukkan angka 0 atau 4.");
                        } else {
                            backToMenu = true;
                        }
                    } else {
                        scan.nextLine();
                        System.out.println("Input tidak valid. Masukkan angka 0 atau 4.");
                    }
                } while (!backToMenu);

            }

            // Exit
            if (menuNumber == 4){
                return;
            }


        } while (menuNumber < 1 || menuNumber > 4);

    }
}
