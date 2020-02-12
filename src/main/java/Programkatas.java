import com.sun.org.apache.xpath.internal.objects.XNull;

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
                for(int j=0;j<=i;j++){
                    System.out.print("# ");

                }

                System.out.println();
            }
        }

        public static void longest(String[] lon) {

            int maxLength = 0;
            String longestString = "";
            for (String l : lon) {
                if (l.length() > maxLength) {
                    maxLength = l.length();
                    longestString = l;
                }
            }
            System.out.println(longestString);
        }


        public static void main(String[] args){
//        hello("Tshepo");
//        evenOrOdd(3);
//        square(2);
//        triangle(2);
//        isosceles(2);
//        longest(new String[]{"the", "quick", "brown", "chickens", "fox", "ate", "my" });
        longest(new String[]{"once", "upon", "a", "time"});
        }
}

