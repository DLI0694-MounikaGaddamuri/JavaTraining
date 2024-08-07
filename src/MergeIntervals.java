import java.util.*;

    class Interval{
        int start,end;

        public Interval(int end, int start) {
            this.end = end;
            this.start = start;
        }
    }
    public class MergeIntervals {
        public static List<Interval> merge(List<Interval> intervals){
            if(intervals.size()<=1)
                return intervals;

            intervals.sort((i1,i2)->Integer.compare(i1.start,i2.start));

            List<Interval> mergedIntervals = new ArrayList<>();
            Interval currentInterval = intervals.get(0);

            for(int i=1;i<intervals.size();i++){
                Interval nextInterval = intervals.get(i);

                if(currentInterval.end >=nextInterval.start){
                    currentInterval.end = Math.max(currentInterval.end,nextInterval.end);
                }else{
                    mergedIntervals.add(currentInterval);
                    currentInterval=nextInterval;
                }
            }
            mergedIntervals.add(currentInterval);

            return mergedIntervals;
        }
        public static void main(String[] args) {

            List<Interval> intervals = Arrays.asList(new Interval(1,3),
                    new Interval(2,6),
                    new Interval(8,10),
                    new Interval(15,18));

            List<Interval> mergedIntervals  = merge(intervals);

            for(Interval interval : mergedIntervals)
                System.out.println(interval.start+" "+interval.end);

        }
    }
