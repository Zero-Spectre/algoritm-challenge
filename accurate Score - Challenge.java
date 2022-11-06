package challenge;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {



//                Deklarasikan variabelnya ya adik adik
        Scanner input = new Scanner(System.in);
        int  nilai;
        float nilay, mean;
                
//                prosesnya    
        System.out.print ("berapa kali ingin menginput nilai ? : ");
        nilai = input.nextInt();
        float all=0;
        int nomor=1;
        while (nomor <= nilai){
                System.out.print ("masukan nilai ke "+ nomor +": ");
                nilay=input.nextInt ();
                all += nilay;
                nomor++;
        }
        mean = all / nilai;
        
        if(mean <= 75){
            String hasil = "Tidak lulus";
            System.out.println("kami putuskan bahwa antum "+ hasil + " dengan nilai rata rata " + mean);
   }else if(mean >= 76 || mean <=99){
        String hasil = "lulus";
       System.out.println("kami putuskan bahwa antum " + hasil + " dengan nilai rata rata "  + mean);

       }  
    }
}
