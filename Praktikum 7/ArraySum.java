/*
 Nama : Ricky Wijaya
 NIM : 18222043
 Praktikum 7
 */


import java.util.ArrayList;

public class ArraySum {
    // nWorkers menyatakan jumlah maksimum threads yang tersedia
    private int nWorkers;
    // array untuk menampung array masukan
    private Integer[] arr;
    /**
     * Tambahkan atribut kelas yang dibutuhkan
     */ 

    /**
     * Konstruktor
     * Inisialisasi atribut kelas
     */
    ArraySum(int nWorkers, Integer[] arr) {
        this.nWorkers = nWorkers;
        this.arr = arr;
    }

    /**
     * Implementasi
     * method sum akan membuat sejumlah thread dan memetakan array masukan secara merata ke semua threads yang dapat dibuat
     */
    public int sum() throws InterruptedException {

        int arrayLength = arr.length;
        int sizechunk = (int) Math.floor((double) arrayLength / nWorkers);
        int[] sums = new int[arrayLength];
        Thread[] threads = new Thread[nWorkers];

        for (int i = 0; i < nWorkers; i++) {
            int idxstart, idxend;
            idxstart = i * sizechunk;
            if (i < nWorkers - 1) {
                idxend = Math.min(idxstart + sizechunk, arrayLength);
            } else {
                idxend = arrayLength;
            }

            final int threadIndex = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (this) {
                        sums[threadIndex] += partialSum(idxstart, idxend);
                    }
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int sum_total = 0;
        for (int sum : sums) {
            sum_total += sum;
        }
        return sum_total;
    }

    /**
     * Implementasi
     * method partialSum akan melakukan penjumlahan elemen-elemen array pada index `start` sampai `end-1`
     */
    protected int partialSum(int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += arr[i];
        }

        return sum;
    }
}