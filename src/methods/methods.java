package methods;

import java.util.Scanner;

public class methods {

    static int adunare(int x, int y){
        return x+y;
    }
    static int scadere (int x, int y){
        if(x>y){
            return x-y;
        }
        else {
            return y-x;
        }
    }
    static int inmultire(int x, int y){
        return x*y;
    }
    static float impartire(int x, int y){
        return x/y;
    }
    static int sumrec(int x){
        if(x>0){
            return x+sumrec(x-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("a= ");
        int a= in.nextInt();
        System.out.println("b= ");
        int b= in.nextInt();
        int suma=adunare(a,b);
        System.out.println("Suma este: "+suma);
        int dif=scadere(a,b);
        System.out.println("Diferenta este: "+dif);
        int prod=inmultire(a,b);
        System.out.println("Produsul este: "+prod);
        float cat=impartire(a,b);
        System.out.println("Catul este: "+cat);
        int sumr= sumrec(a);
        System.out.println("Suma Gauss a lui " +a+ " este: "+sumr);
    }
}
