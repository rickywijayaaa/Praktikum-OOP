/* 
Nama : Ricky Wijaya
NIM : 18222043
Praktikum 8 
 */

import java.util.*;

class MyQueue {
    // Definisi variabel penggunaan stack
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    // Konstruktor
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Menambah elemen x ke belakang Queue
    public void push(int x) {
        s1.add(x);
    }

    // Menghapus elemen dari depan Queue dan mengembalikan elemen tersebut
    public int pop() {
        int front = s1.peek();
        while (!s1.empty()) {
            front = s1.pop();
            s2.add(front);
        }
        s2.pop();
        while(!s2.empty()) s1.add(s2.pop());
        return front;
    }

    // Mengembalikan elemen depan Queue
    public int peek() {
        int front = s1.peek();
        while (!s1.empty()) {
            front = s1.pop();
            s2.add(front);
        }
        while(!s2.empty()) s1.add(s2.pop());
        return front;
    }

    // Mengembalikan apakah Queue kosong (true) atau tidak (false)
    public boolean empty() {
        return s1.empty();
    }
}
