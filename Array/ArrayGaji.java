public class ArrayGaji {
    public static void main(String[] args) {
        String NamaKaryawan [] = {"Asep","Andriana", "Wildan", "Nata", "Rusdi"};
        
        int RatarataGaji, totalGaji = 0, GajiKaryawan []= {2500000, 3000000, 3500000,4000000,4500000};

        System.out.println("======================");

        //Nama dan Gaji Karyawan
        System.out.println("Nama dan Gaji Karyawan");
        System.out.println("======================");
        for (int i = 0; i < GajiKaryawan.length; i++) {
            System.out.println(NamaKaryawan[i] + " : Rp " + GajiKaryawan[i]);
            totalGaji += GajiKaryawan[i];
        }

        System.out.println("======================");


        //Menghitung total pengeluaran gaji
        for (int i = 0; i <GajiKaryawan.length; i++) {
            totalGaji += GajiKaryawan[i];
        } System.out.println("Total Pengeluaran : Rp "+ totalGaji);

        //Menghitung Rata-rata gaji
        RatarataGaji = totalGaji/GajiKaryawan.length;
        System.out.println("Rata-rata gaji    : Rp "+RatarataGaji);

        System.out.println("======================");
    }
}
