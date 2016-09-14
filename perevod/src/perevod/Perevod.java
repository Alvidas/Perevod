
package perevod;

import java.util.Scanner;

/*
 * @author Альвидас
 */
public class Perevod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Введите исходную СС: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        System.out.print("Введите число: ");
        String b = scan.next();
        
        System.out.print("Введите нужную СС: ");
        int c = scan.nextInt();
        
        boolean proverka = b.contains(".");
        
        if(proverka==true){
            String[] dParts = b.split("\\.");
            String m = dParts[0];
            String f = dParts[1];
            int mdes = Integer.parseInt(m, a);
            String mconvert = Integer.toString(mdes, c);
            String nul = "0.";
            String fw = nul + dParts[1];
            double fd = Double.parseDouble(fw);
            double s = fd*c;
            int res = (int)s;
            String fres = Integer.toString(res, a);
            double res1 = s - res; //
            double s1 = res1*c;
            int res2 = (int)s1;
            String fres1 = Integer.toString(res2, a);
            double res3 = s1 - res2; //
            double s2 = res3*c;
            int res4 = (int)s2;
            String fres2 = Integer.toString(res4, a);
            double res5 = s2 - res4; //
            double s3 = res5*c;
            int res6 = (int)s3; //
            String fres3 = Integer.toString(res6, a);
            String fconvert = fres + fres1 + fres2 + fres3;
            System.out. println("Ответ: "+ mconvert + "." + fconvert);
        }else{
            int num = Integer.parseInt(b, a);
            String convert = Integer.toString(num, c);
            System.out.println("Ответ: " + convert);
        }
    }
    
}
