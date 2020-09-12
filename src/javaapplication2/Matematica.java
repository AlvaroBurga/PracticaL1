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

    static public void fibonacci(int n){
         int n1=0,n2=1,n3,i;  
        System.out.print(n1+" "+n2);

        for(i=2;i<n;++i) 
        {  
         n3=n1+n2;  
         System.out.print(" "+n3);  
         n1=n2;  
         n2=n3;  
        }
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
