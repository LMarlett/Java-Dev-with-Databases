import java.security.PublicKey;

public class HW2Jimenez {


   public static void quarterSalesReport (double[] tSales){
       System.out.print("Quarter    " + "Total Sales    " + "East Cost Sales    "
       + "Other Sales   ");
       System.out.print("_______________________________________________________________________________");

       for(int i=0; i < tSales.length; i++){
                double total = 0;
                double east, other;
                        total = tSales[i];
                        east = (total * 0.6) - total;
                                other = total - east;
            System.out.print("Q" + i + "    " + total + "   " + east + "    " + other);

        }

   }

   public static void quarterComisssionReport(double[]tSales){
       System.out.print("Quarter    " + "Total Sales    " + "East Cost Sales    "
               + "Total Commission   ");
       System.out.print("_______________________________________________________________________________");

       for(int i=0; i < tSales.length; i++){
           double total = 0;
           double east, comm, ten;
           total = tSales[i];
           east = (total * 0.6) - total;
           ten = (total*0.1) - total;
           comm = 5 * (( ten * .002) - ten);
           System.out.print("Q" + i + "    " + total + "   " + east + "    " + comm);

       }


   }

    public static void main (String[]args){
        double[] totalSales = new double[4];
        totalSales[0] = 4800000;
        totalSales[2] = 5700000;
        totalSales[3] = 6600000;
        totalSales[4] = 7500000;


        quarterSalesReport(totalSales);
        quarterComisssionReport(totalSales);



    }


}
