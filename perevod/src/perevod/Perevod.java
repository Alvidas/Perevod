
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
        scan.close();
        
        boolean proverka = b.contains(".");
        
        if(proverka==true){

            String[] bParts = b.split("\\.");//Деление на дробную и целую часть.
            String m = bParts[0];
            String f = bParts[1];
            
            int mdes = Integer.parseInt(m, a);//Преобразование целой части.
            String mconvert = Integer.toString(mdes, c);
           
            
            String fconvert = "";
            if(a==10){
            String nul = "0.";//Преобразование дробной.
            String fw = nul + f;
            double fd = Double.parseDouble(fw);
                for(int i = 0; i<4; i++){
                    double s = fd*c;
                    int res = (int)s;
                    String fres = Integer.toString(res,a);
                    fd = s - res; 
                    fconvert = fconvert + fres;
                }
            }else{
                int fe = f.length();
                char[] fChar = f.toCharArray ();
                double result = 0;
                for(int e = 0; e < fe; e++){
                    String f1 = Character.toString(fChar[e]);
                    int i1 = Integer.parseInt(f1, a);
                    double x1 = Math.pow(a, -e);
                    result = result + x1*i1;
                }
                String fcon = Double.toString(result);
                String[] fParts = fcon.split("\\.");
                String nul = "0.";//Преобразование дробной.
                String fw = nul + fParts[1];
                double fde = Double.parseDouble(fw);
                if(c!=10){
                    for(int i = 0; i<4; i++){
                        double s = fde*c;
                        System.out.println(s);
                        int res = (int)s;
                        String fres = Integer.toString(res);
                        fde = s - res; 
                        fconvert = fconvert + fres;
                    }
                }else{
                    fconvert = fParts[1];  
                }
            }
            System.out. println("Ответ: "+ mconvert + "." + fconvert);
        }else{                           //Преобразование целого числа.
            int num = Integer.parseInt(b, a);
            String convert = Integer.toString(num, c);
            System.out.println("Ответ: " + convert);
        }
    }
}