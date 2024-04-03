import java.util.ArrayList;
import java.util.List;

public class GreedySearch {
    static class TimeSlot{
        public int start;
        public int end;
        public TimeSlot(int start, int end){
            this.start = start;
            this.end = end;
        }
        @Override
        public String toString(){
            return "("+start+" "+end+")";
        }
    }

    public static TimeSlot addSlot(int start, int end){
        return new TimeSlot(start, end);
    }

    public static String greedySearch(List<TimeSlot> list){
        String string = "";
        int i = 0;
        string += list.get(i);
        for(int j = 1; j < list.size(); j++){
            if(list.get(j).start > list.get(i).end){
                string+=", " + list.get(j);
                i = j;
            }
        }
        return string;
    }

    public static void main(String[] args) {
        List<TimeSlot> list = new ArrayList<>();
        int[] startTimes = new int[]{1,3,0,5,3,5,6,8,8,2,12};
        int[] endTimes = new int[]{4,5,6,7,8,9,10,11,12,13,14};
        for(int i = 0; i < startTimes.length; i++){
            list.add(new TimeSlot(startTimes[i],endTimes[i]));
        }
        System.out.println(greedySearch(list));
    }
}
