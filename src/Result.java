import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> score = new ArrayList<>();

        int scoreAlice = 0;
        int scoreBob = 0;
        for (int i = 0; i < a.size(); i++){

            if(a.get(i) > b.get(i)){

                scoreAlice++;
            }

            else if(a.get(i) < b.get(i))
            {
                scoreBob++;
            }

        }

        score.add(scoreAlice);
        score.add(scoreBob);
        return score;


    }

}
 /* Java that works
pointsAlice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0) ;
        pointsBob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0) ;
        System.out.println(pointsAlice+" " +pointsBob);

 /* C# that works

    int pointsAlice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0);
    int pointsBob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0);

    return new int[] {pointsAlice, pointsBob};
*/
