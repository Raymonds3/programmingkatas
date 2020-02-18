import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Programkatas {

        public static void hello(String name){
            System.out.println("Hello "+ name);
        }

        public static void evenOrOdd(int num){
            if((num/2)*2 == num){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }

        public static void square(int hush){
            for(int i=1;i<=hush;i++){
                for(int x=1;x<=hush;x++){
                    System.out.print("#");
                }
                System.out.print("\n");
            }

        }

        public static void triangle(int husht){
            for(int i=1;i<=husht;i++){
                for(int x=1;x<=i;x++){
                    System.out.printf("#");
                }
                System.out.println();
            }
        }

        public static void isosceles(int hushtr){
            for(int i=0;i<hushtr;i++){
                for(int j=hushtr-i;j>1;j--){
                    System.out.print(" ");
                }
                for(int j=0;j<=i*2;j++){
                    System.out.print("#");

                }

                System.out.println();
            }
        }

        public static void longest(String... lon) {
            ArrayList<String> list = new ArrayList<String>();
            int longest_length = 0;
            for (String i : lon) {
                int length = i.length();
                if (length > longest_length) {
                    longest_length = length;
                    list.clear();
                }
                if (length == longest_length) {
                    list.add(i);
                }
            }
            for (String each:list) {

                System.out.println(each);
            }
        }
        public static void combine(int a[], int b[]) {
            int aLen = a.length;
            int bLen = b.length;
            int[] result = new int[aLen + bLen];
            int i=0, j=0,k=0;
            while(i<aLen&&j<bLen) {
                result[k++]=a[i++];
                result[k++]=b[j++];
            }
            while (i<aLen) {
                result[k++]=a[i++];
            }
            while (j<bLen) {
                result[k++]=b[j++];
            }
            System.out.println(Arrays.toString(result));
        }

        public static void frame(String... fra){

            System.out.println("*********");
            for(String i:fra){
                    if (i.length() == 5) {
                        System.out.print("* " + i);
                        System.out.print(" ");
                        System.out.print("*\n");
                    } else if (i.length() == 4) {
                        System.out.print("* " + i);
                        System.out.print("  ");
                        System.out.print("*\n");
                    } else if (i.length() == 3) {
                        System.out.print("* " + i);
                        System.out.print("   ");
                        System.out.print("*\n");
                    }else{
                        continue;
                    }
            }
            System.out.println("*********");
        }



        public static void main(String[] args){
        hello("Tshepo");
        evenOrOdd(3);
        square(4);
        triangle(4);
        isosceles(4);
        longest("the", "quick", "brown", "chickens", "fox", "ate", "my");
        longest("once", "upon", "a", "time", "hi");
            int a[] = {11,22,33};
            int b[] = {1,2,3};
        combine(a,b);
        frame("Write", "good", "code", "every", "day");
        }
}

