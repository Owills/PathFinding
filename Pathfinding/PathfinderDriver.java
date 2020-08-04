
public class PathfinderDriver {
    public static void main(){
        long start = System.currentTimeMillis();
        
        String solution = Pathfinder.findShortestPath(MapFactory.buildMapFromNewYork(),"Monterey, CA");
        
        long end = System.currentTimeMillis();
        
        //Print out path and total processing time only after the timer is stopped.
        System.out.println(solution);
        System.out.println("Finding this path took " + (end - start) + " milliseconds.");
    }
}
