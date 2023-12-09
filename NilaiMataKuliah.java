package Testing2;

import java.util.ArrayList;

public class NilaiMataKuliah {
    public static void main(String[] args) {
       
        ArrayList<MataKuliah> nilaiMataKuliah = new ArrayList<>();

        
        nilaiMataKuliah.add(new MataKuliah(1,"PS0101","Nilai Dasar Shalih Ahkram", 2, "B","3,00", "70,00"));
        nilaiMataKuliah.add(new MataKuliah(2,"PS0102","Teologi Aswaja", 2, "A-","3,50", "83,00"));
        nilaiMataKuliah.add(new MataKuliah(3,"PS0103","Civic Education", 2, "A-","3.50", "88,00"));
        nilaiMataKuliah.add(new MataKuliah(4,"PS0104","Ulumul Qur'an", 2, "A-","3,50", "80,00"));
        nilaiMataKuliah.add(new MataKuliah(5,"PS0102","Sejarah Pemikiran dan Keuangan Perbankan", 2, "B+","3,25", "79,50"));
        nilaiMataKuliah.add(new MataKuliah(6,"PS0103","Bahasa Arab", 2, "B-","2.75", "68,00"));
        nilaiMataKuliah.add(new MataKuliah(7,"PS0101","Bahasa Inggris", 2, "B","3,00", "72,45"));
        nilaiMataKuliah.add(new MataKuliah(8,"PS0102","Pengantar Ekonomi Mikro", 2, "A-","3,50", "82,00"));
        nilaiMataKuliah.add(new MataKuliah(9,"PS0103","Manajemen Syariah", 2, "A-","3.50", "84,50"));
        nilaiMataKuliah.add(new MataKuliah(10,"PS0101","Pengantar Filsafat", 2, "A-","3,50", "83,80"));
        nilaiMataKuliah.add(new MataKuliah(11,"PS0102","Bahasa Indonesia", 2, "A-","3,50", "80,00"));
        
        System.out.println("Kartu Hasil Studi (KHS)");
        System.out.println("Nama Mahasiswa: Nabiel");

        // for (MataKuliah mataKuliah : nilaiMataKuliah) {
        //     System.out.println("No: " + mataKuliah.getnomer() +
        //             " |Kode: " + mataKuliah.getkode() +
        //             " |Mata Kuliah: " + mataKuliah.getNamaMataKuliah() +
        //             " |SKS: " + mataKuliah.getSks() + 
        //             " |Hurufmutu: " + mataKuliah.getNilai() +
        //             " |Bobot: " + mataKuliah.getbobot() +
        //             " |Nilai: " + mataKuliah.getnilai());
        // }
        System.out.println("====================================================================");        
        System.out.println("No |"+"kode |"+"mata kuliah |"+"SKS |"+"Huruf mutu |"+"Bobot |"+"Nilai |");
        System.out.println("====================================================================");
        for (MataKuliah mataKuliah : nilaiMataKuliah) {
            System.out.println(
                mataKuliah.getnomer() + " | " +
                mataKuliah.getkode() + " | " +
                mataKuliah.getNamaMataKuliah() + " | " +
                mataKuliah.getSks() + " | " +
                mataKuliah.getNilai() + " | " +
                mataKuliah.getbobot() + " | " +
                mataKuliah.getnilai());
        }
        System.out.println("====================================================================");
        System.out.println("Jumlah SKS: 23");
        System.out.println("IP Semester: 3,33");
        System.out.println("SKS Maksimal yang bisa diambil di semester depan: 24");
    }
}


class MataKuliah {
    private int nomer;
    private String kode;
    private String namaMataKuliah;
    private int sks;
    private String hurufMutu;
    private String bobot;
    private String nilai;

    public MataKuliah(int nomer ,String kode,String namaMataKuliah, int sks, String hurufMutu, String bobot, String nilai) {
        this.nomer = nomer;
        this.kode = kode;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.hurufMutu = hurufMutu;
        this.bobot = bobot;
        this.nilai = nilai;
    }

    public int getnomer(){
        return nomer;
    }
    
    public String getkode(){
        return kode;
    }
    
    
    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public int getSks() {
        return sks;
    }

    public String getNilai() {
        return hurufMutu;
    }

    public String getbobot() {
        return bobot;
    }

    public String getnilai() {
        return nilai;
    }

    
}
