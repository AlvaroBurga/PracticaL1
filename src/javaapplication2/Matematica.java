package javaapplication2;

public class Matematica {

    public void primo(){

    }

    public void mcd(){

    }

    public void fibonacci(int n){
         
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

    public void factorial(){

    }

}
