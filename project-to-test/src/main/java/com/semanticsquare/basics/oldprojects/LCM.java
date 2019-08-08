import com.semanticsquare.basics.oldprojects.Gcd;

public class LCM {
        public static void main(String[] args) {

            LCM obj= new LCM();
            obj.calculateLCM(20,75);

        }
        //public void calculateLCM(int n1 , int n2 ){
        public void calculateLCM(int s1 , int s2 ){                             //and this method doesn't to return a value and the valuable of parameter can change or stay the same as long data type is the same .
            int lcm;
            Gcd obj = new Gcd();                                                  //create obj or and name which will help to access the method
       int temp = obj.calculateGcd(s1,s2);                                       // temp will equal the container of gcd from another program means

            lcm = (s1 * s2) / temp;                                             // this line is equal  lcm = (n1 * n2) / gcd frm Gcd program but was invisible in our program so we will have ;
                                                                               // when everything is on one line combine both line 12 & 14

            System.out.printf("The LCM of %d and %d is %d.", s1, s2, lcm);
            }
        }



