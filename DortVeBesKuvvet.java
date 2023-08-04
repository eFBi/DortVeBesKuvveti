import java.util.Scanner;

public class DortVeBesKuvvet {
    public static void main(String[] args) {
        
        /*
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        Scanner inp=new Scanner(System.in);
        System.out.print("sıfırdan hangi sayıya kadar olsun: ");
        int n = inp.nextInt();
        //int k = inp.nextInt();
       

        
        for(int i=0;i<n;i++){
            int kuvvet = (int) Math.pow(4,i);
            System.out.println("4^"+i+" : "+ kuvvet);
            
        }

        for(int i=0;i<n;i++){
            int kuvvet = (int) Math.pow(5,i);
            System.out.println("5^"+i+" : "+ kuvvet);
        }


    }
    
}
