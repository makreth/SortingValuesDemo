import java.util.*;

public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry>{
    
    public int compare(QuakeEntry qe1, QuakeEntry qe2){
        String temp[] = qe1.getInfo().split(" ");
        String word1 = temp[temp.length - 1];
        temp = qe2.getInfo().split(" ");
        String word2 = temp[temp.length - 1];
        int result = word1.compareTo(word2);

        if(result == 0){
            return Double.compare(qe1.getMagnitude(), qe2.getMagnitude());
        }
        else{
            return result;
        }
    }

}