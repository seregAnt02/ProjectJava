package HW5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class PBComparator implements Comparator<Map.Entry<String, ArrayList<String>>> {

    @Override
    public int compare(Entry<String, ArrayList<String>> o1, Entry<String, ArrayList<String>> o2) {
        if(o1.getValue().size() > o2.getValue().size()) return -1;
        else if(o1.getValue().size() < o2.getValue().size()) return 1;
        else return 0;        
    }

}
