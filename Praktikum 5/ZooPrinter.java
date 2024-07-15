import java.lang.System;
import java.util.ArrayList;
import java.util.List;


public class ZooPrinter <U> {
    // Hint 1:
    // List adalah interface Java yang merupakan subinterface dari interface Collection
    // Deklarasi tipe generic `List` di Java yang sudah tersedia adalah:
    // `public interface List<E> extends Collection<E>`
    // 
    // Seperti dapat dilihat, List bisa menggunakan variabel tipe (T) generic saat digunakan. Contoh penggunaannya:
    // List<Integer> integerList = ...;   

    // Hint 2:
    // Iterasi melalui seluruh elemen list dapat digunakan dengan loop for-each, yang di Java bisa dilakukan dengan sintaks:
    // for (E element : elementList){
        //operasi pada elementList
    // }
    
    public <U> void printListOfAnimal (List<Animal> ListAnimals){
        for (Animal element : ListAnimals){
            System.out.println(element.getName());
        }
    }
    
    public <U> void printListOfElang (List<? extends Elang> ListElang){
        for (Elang element : ListElang){
            System.out.println(element.getTelur());
        }
    }

    public <U> void printClassNameOfList (List<Object> ListObject){
        for (Object element : ListObject){
            System.out.println(element.getClass().getName());
        }
    }

    public <U> void printObjectClassName (U namlist){
        System.out.println(namlist.getClass().getName());
    }


}

class Animal {
    private String name;
  
    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Elang extends Animal{
    private int telur;
    public Elang(String name, int jumlahTelur){
        super(name);
        this.telur = jumlahTelur;
    }

    public int getTelur(){
        return this.telur;
    }
}

class ElangJawa extends Elang{
    public ElangJawa(String name, int jumlahTelur){
        super(name,jumlahTelur);
    }
}

class Gajah extends Animal{
    public Gajah(String name){
        super(name);
    }
}

