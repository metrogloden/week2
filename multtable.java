package week2;


public class Day1TimesTable {

    public static void main(String[] args) {
        int tableSize = 12;
        int i;
        int j;
        System.out.print(" * |  ");
        //printTimesTable(tableSize);

        for(i=1; i<10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(i=1; i<34; i++) {
            System.out.print("-");
        }

        System.out.print("\n" + " 1 |  ");

        for(i=1; i<10; i++) {

         for(j=1; j<10; j++) {

             if((i * j) < 10) {

                 System.out.print(i*j + " ");
             }

             else {
                 System.out.print(i*j + " ");
             }
         }

         System.out.println();
            if((0 < 1) && (i < 9)) {
                System.out.print(" " + (i+1) + " |  ");
            }
        }
    }
