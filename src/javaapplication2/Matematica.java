package javaapplication2;

public class Matematica {

    static public boolean primo(int numero){
        boolean primo = true;
        for (int i=2; i<=Math.sqrt((numero)); i++)
        {
            if(numero%i==0) primo=false;
        }
        return primo;
    }

    static public int mcd(int num1, int num2){
 
        int mcd=1;
        boolean fin=true;
        int i=2;
        while(fin)
        {
            if(num1%i==0 && num2%i==0)
            {
                mcd*=i;
                num1/=i;
                num2/=i;
                
            }
            else
            {
                i++;
            }
            if(i>num1||i>num2) fin=false;
        }
        
        return mcd;
    }

    static public void fibonacci(){

    }

    static public void factorial(){

    }

}
