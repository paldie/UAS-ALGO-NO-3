//FAKHRI NAUFALDI RAMADHAN
//227064516035

// Definisi kelas Main
public class Main {
    public static void main(String[] args) {
        // Objek Pegawai (Employee) pertama dan kedua diciptakan dan diinisialisasi dengan atribut yang berbeda
        Pegawai pegawai1 = new Pegawai("paldie", "Laki-laki", "101", true);
        Pegawai pegawai2 = new Pegawai("mamat", "Perempuan", "102", false);

        // Menampilkan informasi untuk Pegawai 1
        System.out.println("Pegawai 1:");
        pegawai1.toShow();
        System.out.println("Tunjangan: " + pegawai1.getTunjangan());
        System.out.println();

        // Menampilkan informasi untuk Pegawai 2
        System.out.println("Pegawai 2:");
        pegawai2.toShow();
        System.out.println("Tunjangan: " + pegawai2.getTunjangan());
        System.out.println();

        // Objek Programmer pertama, kedua, dan ketiga diciptakan dan diinisialisasi dengan atribut yang berbeda
        Programmer programmer1 = new Programmer("paldi", "Laki-laki", "201", false, 5, 5000000);
        Programmer programmer2 = new Programmer("rara", "Perempuan", "202", true, 2, 4500000);
        Programmer programmer3 = new Programmer("udin", "Laki-laki", "203", true, 12, 8000000);

        // Menampilkan informasi untuk Programmer 1
        System.out.println("Programmer 1:");
        programmer1.toShow();
        System.out.println("Tunjangan: " + programmer1.getTunjangan());
        System.out.println("Bonus: " + programmer1.getBonus());
        System.out.println();

        // Menampilkan informasi untuk Programmer 2
        System.out.println("Programmer 2:");
        programmer2.toShow();
        System.out.println("Tunjangan: " + programmer2.getTunjangan());
        System.out.println("Bonus: " + programmer2.getBonus());
        System.out.println();

        // Menampilkan informasi untuk Programmer 3
        System.out.println("Programmer 3:");
        programmer3.toShow();
        System.out.println("Tunjangan: " + programmer3.getTunjangan());
        System.out.println("Bonus: " + programmer3.getBonus());
    }
}
