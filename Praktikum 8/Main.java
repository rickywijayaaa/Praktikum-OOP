/* 
Nama : Ricky Wijaya
NIM : 18222043
Praktikum 8 
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            int n = Integer.parseInt(x.nextLine());
            Set<String> data = new HashSet<>();
            for(int i = 0; i < n; i++) 
            {
                char sorted[] = (x.next()).toCharArray(); 
                Arrays.sort(sorted);
                String cur = new String(sorted);
                data.add(cur);
            }
            System.out.println(data.size()); 
        }
    }
}

