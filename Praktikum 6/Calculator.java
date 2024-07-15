public class Calculator {
    public Calculator() { };

    public double calculate(double a, double b, char operation) throws InvalidDivisionException,InvalidOperationException{
        /**
         * Implementasi
         * Apabila operasi yang dimasukkan pengguna bukan `+`, `-`, `*`, atau `/`, maka
         * kalkulator akan mengembalikan pesan error dari kelas
         * `InvalidOperationException` dengan pesan `Invalid Operation: <operasi yang dimasukan>`
         * 
         * Apabila kalkulator menerima masukan pembagian terhadap 0, maka kalkulator
         * akan mengembalikan pesan error dari kelas `InvalidDivisionException`
         * dengan pesan `Invalid Division: Tidak dapat melakukan pembagian terhadap 0!`
         */
        if (operation == '+'){
            return a+b;
        } 
        else if (operation == '-'){
            return a-b;
        }
        else if (operation == '*'){
            return a*b;
        }
        else if (operation =='/'){
            if(b==0){
                throw new InvalidDivisionException("Invalid Division: Tidak dapat melakukan pembagian terhadap 0!");
            }
            else {
                return a/b;
            }
        }
        else {
            throw new InvalidOperationException("Invalid Operation: " + operation);
            
        }
    }
}

class CalculatorException extends Exception{
    public CalculatorException(String message) {
        super(message);
    }
}



class InvalidDivisionException extends CalculatorException {
    public InvalidDivisionException(String message){
        super(message);
    }
}

class InvalidOperationException extends CalculatorException {
    public InvalidOperationException(String message){
        super(message);
    }
}

/**
 * Implementasikan:
 * 1. Calculator Exception
 * 2. InvalidOperationException
 * 3. InvalidDivisionException
 */
