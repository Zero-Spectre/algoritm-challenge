package challenge;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
// KALO MAU COPY DARI SINI YA ADIK ADIK ==============================

//                Deklarasi
        Scanner input = new Scanner(System.in);
        int  nilai;
        float nilay, mean;
                
//                proses
        System.out.print ("berapa kali ingin menginput nilai ? : ");
        nilai = input.nextInt();
        float all=0;
        int nomor=1;
        
        for (nomor = 1; nomor <= nilai; nomor++) {
                System.out.print ("masukan nilai ke "+ nomor +": ");
                nilay=input.nextInt ();
                all += nilay;
}
  
        mean = all / nilai;
        
        if(mean <= 75){
            String hasil = "Tidak lulus";
            System.out.println("kami putuskan bahwa antum "+ hasil + " dengan nilai rata rata " + mean);
   }else if(mean >= 76 || mean <=99){
        String hasil = "lulus";
       System.out.println("kami putuskan bahwa antum " + hasil + " dengan nilai rata rata "  + mean);

       }  
//       SAMPAI SINI=========================================
    }
    
}
