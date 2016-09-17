
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
                for(int i = 0; i<4; i++){
                    String nul = "0.";//Преобразование дробной.
                    int fdes = Integer.parseInt(f, a);
                    String fw = nul + f;
                    //System.out.print(fw);
                    double fd = Double.parseDouble(fw);
                    double s = fd*c;
                    int res = (int)s;
                    String fres = Integer.toString(res,a);
                    fd = s - res; 
                    fconvert = fconvert + fres;
                }
            }else{
                char[] fChar = f.toCharArray ();
                String f1 = Character.toString(fChar[0]);
                int i1 = Integer.parseInt(f1, a);
                String f2 = Character.toString(fChar[1]);
                int i2 = Integer.parseInt(f2, a);
                String f3 = Character.toString(fChar[2]);
                int i3 = Integer.parseInt(f3, a);
                String f4 = Character.toString(fChar[3]);
                int i4 = Integer.parseInt(f4, a);
                double x1 = Math.pow(a, -1);
                double x2 = Math.pow(a, -2);
                double x3 = Math.pow(a, -3);
                double x4 = Math.pow(a, -4);
                double result = x1*i1 + x2*i2 + x3*i3 + x4*i4;
                String fcon = Double.toString(result);
                String[] fParts = fcon.split("\\.");
                double fd = result;
                if(c!=10){
                    for(int i = 0; i<4; i++){
                        double s = fd*c;
                        int res = (int)s;
                        String fres = Integer.toString(res,a);
                        fd = s - res; 
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