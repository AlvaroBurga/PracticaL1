package javaapplication2;

public class Matematica {

    public void primo(){

    }

    public void mcd(){

    }

    public void fibonacci(){

    }

    public void factorial(int numero){
        double facto = 1;
        while ( numero!=0) {
            facto=facto*numero;
            numero--;
        }

        System.out.println("El factorial es: " + facto);
    }

}
