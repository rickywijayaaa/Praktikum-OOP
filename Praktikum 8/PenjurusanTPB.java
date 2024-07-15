/* 
Nama : Ricky Wijaya
NIM : 18222043
Praktikum 8 
 */

import java.util.*;

public class PenjurusanTPB {

    public static class Mahasiswa {
        private Integer NIM;
        private String Nama;
        private Double IP;
        private Double UKT;
        
        public Mahasiswa(Integer NIM, String nama, Double IP, Double UKT) { 
            // TODO!
            this.NIM = NIM;
            this.Nama = nama;
            this.IP = IP;
            this.UKT = UKT;
        }

        public Integer getNIM() { 
            // TODO!
            return this.NIM;
        }
        
        public String getNama() {
            // TODO!

            return this.Nama;
        }

        public Double getIP() {
            // TODO!
            return this.IP;
        }

        public Double getUKT() {
            // TODO!
            return this.UKT;
        }
    }

    private static class MahasiswaComparator implements Comparator<Mahasiswa> {
        /**
         * Membandingkan Mahasiswa dengan urutan sebagai berikut:
         *  1. UKT yang lebih besar akan diprioritaskan.
         *  2. IP yang lebih besar akan diprioritaskan.
         *  3. NIM yang lebih kecil akan diprioritaskan. (NIM dipastikan unik)
         */
        public int compare(Mahasiswa mahasiswa1, Mahasiswa mahasiswa2) {
            // TODO!
            if(mahasiswa1.getUKT()-mahasiswa2.getUKT() > 0) return -1;
            if(mahasiswa1.getUKT()-mahasiswa2.getUKT() < 0) return 1;
            if(mahasiswa1.getIP()-mahasiswa2.getIP() > 0) return -1;
            if(mahasiswa1.getIP()-mahasiswa2.getIP() < 0) return 1;
            if(mahasiswa1.getNIM()-mahasiswa2.getNIM() > 0) return 1;
            return -1;
        }
    }

    /**
     * Menerima List<Mahasiswa> yang tidak terurut
     * Mengembalikan PriorityQueue<Mahasiswa> yang sudah terurut berdasarkan prioritas.
     */
    public static PriorityQueue<Mahasiswa> PembangkitanAntrianPrioritas(List<Mahasiswa> list) {
        // TODO!
        PriorityQueue<Mahasiswa> ans = new PriorityQueue<>(new MahasiswaComparator());
        for(Mahasiswa m : list) ans.add(m);
        return ans;
    }
}
