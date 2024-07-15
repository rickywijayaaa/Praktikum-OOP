import java.util.Scanner;

public class TokoElektronik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        int hargatotal=0;

        for (int i =0 ; i<jumlah;i++){
            int jenis = input.nextInt();
                if (jenis==1){
                    String brand = input.next();
                    String bentuk = input.next();
                    int storage = input.nextInt();
                    int batre = input.nextInt();
                    Smartphone hp = new Smartphone(brand, bentuk, storage, batre);
                    hp.displayDetails();
                    System.out.printf("Price: %d\n",hp.calculatePrice());
                    hargatotal += hp.calculatePrice();
                }
                else if (jenis==2){
                    String merk2 = input.next();
                    String bentuk2 = input.next();
                    String processor = input.next();
                    int ram = input.nextInt();
                    int touch = input.nextInt();
                    if (touch == 1){
                        Laptop laptop = new Laptop(merk2, bentuk2, processor, ram, true);
                        laptop.displayDetails();
                        System.out.printf("Price: %d\n",laptop.calculatePrice());
                        hargatotal += laptop.calculatePrice();
                    }
                    else{
                        Laptop laptop = new Laptop(merk2, bentuk2, processor, ram, false);
                        laptop.displayDetails();
                        System.out.printf("Price: %d\n",laptop.calculatePrice());
                        hargatotal += laptop.calculatePrice();
                    }

                }
                else{
                    String merk3 = input.next();
                    String bentuk3 = input.next();
                    int sizescreen = input.nextInt();
                    int seluler = input.nextInt();
                    if (seluler == 1){
                        Tablet tab = new Tablet(merk3, bentuk3, sizescreen,true);
                        tab.displayDetails();
                        System.out.printf("Price: %d\n",tab.calculatePrice());
                        hargatotal += tab.calculatePrice();
                    }
                    else{
                        Tablet tab = new Tablet(merk3, bentuk3, sizescreen,false);
                        tab.displayDetails();
                        System.out.printf("Price: %d\n",tab.calculatePrice());
                        hargatotal += tab.calculatePrice();
                    }

                }
            }
            System.out.printf("Total price: %d\n",hargatotal);
    }
}
