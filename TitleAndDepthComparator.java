import java.util.*;

public class TitleAndDepthComparator implements Comparator<QuakeEntry>{
    public int compare(QuakeEntry qe1, QuakeEntry qe2){
        int result = qe1.getInfo().compareTo(qe2.getInfo());
        if(result == 0){
            return Double.compare(qe1.getDepth(), qe2.getDepth());
        }
        else{
            return result;
        }
    }

}
