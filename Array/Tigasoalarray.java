

public class Tigasoalarray {
    public static void main(String[] args) {
        //Soal 1
        System.out.println("Soal 1");
        String namakota [] = {"Blitar", "Surabaya", "Sidoarjo", "Malang", "Jember", "Banyuwangi","Ngawi"};
        for (int i = 0; i < namakota.length; i++){
            System.out.println(namakota[i]);
        } System.out.println();

        //Soal 2
        System.out.println("Soal 2");
        String [] matapelajaran = {"MTK", "Inggris", "Indonesia", "Fisika", "IPA", "IPS"};
        for (int i = 0; i < matapelajaran.length; i++){
            System.out.println(i+1 + ". " + matapelajaran[i]);
        } System.out.println();

        //Soal 3
        System.out.println("Soal 3");
        String [] namahewan = {"Anjing", "Kucing", "Sapi", "Rusa", "Kambing", "Lumba-Lumba"};
        for (int i = 0; i < namahewan.length; i++){
            if (namahewan[i].length() > 4){
                System.out.println("*" + namahewan[i]);
            }
        } System.out.println();
    }
}
