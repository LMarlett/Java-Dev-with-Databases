import javax.lang.model.element.NestingKind;
import javax.print.attribute.standard.MediaSize;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class HW3CJimenez {


public static String cityCoder(String Cname, String Cstate, int Cpop) {
    String code;

    int seq1;
    String seq2;
    int seq3;

    seq1 = Cname.length();
    seq2 = Cstate;
    seq3 = Cpop / 1000000;
    DecimalFormat df = new DecimalFormat("#");
    df.format(seq3);

    Integer.toString(seq1);
    Integer.toString(seq3);

    code = seq1 + "-" + seq2 + "-" + seq3;
return code;
}

public static void cityCodeChart(String[] NArray, String[]SArray, int[]PArray){

    System.out.println("City Name" + "  " + "City State "+ "  " + "City Population" + "  " + "City Code" );
    System.out.println("____________________________________________________________________________" );

    for (int i = 0; i<NArray.length; i++){
        String code = cityCoder(NArray[i], SArray[i], PArray[i]);
//not sure how to put the results in equal columns

        System.out.println(NArray[i] + "    " + SArray[i]+ "    " + PArray[i] + "     "  + code);


    }
}

public static void main(String[]args){

     //System.out.print(cityCoder("New York", "NY", 9898700));

     String[] A = {"Los Angeles","Chicago","Houston","Philadelphia","Phoenix"};
     String[] B = {"CA","IL","TX","PA","AZ"};
     int[] C = {3971883,270546,2296224, 1567442, 1563025};

     cityCodeChart(A, B, C);


   /* NArray = new String[5];
    NArray[0] = "Los Angeles";
    NArray[1] ="Chicago";
    NArray[2] = "Houston";
    NArray[3] = "Philadelphia";
    NArray[4] ="Phoenix";

    SArray = new String[5];
    SArray[0] = "CA";
    SArray[1] ="IL";
    SArray[2] = "TX";
    SArray[3] = "PA";
    SArray[4] ="AZ";

    PArray = new int[5];
    PArray[0] = 3971883;
    PArray[1] = 270546;
    PArray[2] = 2296224;
    PArray[3] = 1567442;
    PArray[4] = 1563025;*/
}

}
