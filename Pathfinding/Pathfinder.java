import java.util.ArrayList;
public class Pathfinder {
    
    //returns a string that lists each city along a valid path from the starting city
    //to the goal city, as well as the total drive time.
    //For example: "Portsmouth, NH - Portland, ME - Bangor, ME. Total time: 173 minutes."
    public static String findShortestPath(City startCity, String goalCity){  
        System.out.println(startCity.getName());
        System.out.println(goalCity);
        ArrayList<City> cities = new ArrayList<City>();
        cities.add(startCity);
        for(int i = 0; i< cities.size(); i ++){  
            ArrayList<Connection> connections = cities.get(i).getConnections();
            for(int j = 0; j < connections.size(); j++){
                if(inArrayList(connections.get(j).getDestination().getName(),cities) == -1){
                    cities.add(connections.get(j).getDestination());
                }    
            }    
        }   
        int[] times = new int[cities.size()]; // quickest time from start city
        ArrayList<City>[] paths = new ArrayList[cities.size()]; // quickest path from start city
        
        ArrayList<City> visited = new ArrayList<City>();
        City temp = startCity;
        int time = 0;
        ArrayList<City> path = new ArrayList<City>();
        path.add(startCity);
        times[0] = 0;
        for(int i = 1; i < times.length; i ++)
            times[i] = Integer.MAX_VALUE;
        for(int i = 0; i < paths.length; i ++){
            paths[i] = new ArrayList<City>();
        } 
        
        while(visited.size() < cities.size()){
            ArrayList<Connection> connections = temp.getConnections();
            for(int i = 0; i <connections.size(); i++){
                int num = inArrayList(connections.get(i).getDestination().getName(),cities);
                if(connections.get(i).getDriveTime() + time < times[num] ){
                    //System.out.println("yay");
                    times[num] = connections.get(i).getDriveTime() + time;
                    for(int j = 0; j < path.size(); j++){
                        paths[num].add(path.get(j));
                    }    
                    paths[num].add(connections.get(i).getDestination());
                }    
            }    
            visited.add(temp);
            if(visited.size() < cities.size()){
                temp = cities.get(inArrayList(temp.getName(),cities)+1);
                time = times[inArrayList(temp.getName(),cities)];
                path = paths[inArrayList(temp.getName(),cities)];
            }
        }    
        System.out.println();
       
        // for(int i = 0; i < paths[num].size(); i++){
            // System.out.println(paths[num].get(i).getName());
        // } 
        // int nim = 0;
        // for(int i = 0; i < paths[num].size()-1; i++){
            // ArrayList<Connection> connections = paths[num].get(i).getConnections();
            // for(int j = 0; j< connections.size(); j++){
                // if(connections.get(j).getDestination().equals(paths[num].get(i+1)))
                    // nim += connections.get(j).getDriveTime();
            // }    
        // }   
        // System.out.println(times[num]);
        // System.out.println(nim);
         int num = inArrayList(goalCity, cities);
        String ans ="";
        for(int i = 0; i < paths[num].size(); i++){
            ans+= paths[num].get(i).getName();
            if(i < paths[num].size()-1)
                ans += " -> ";
            
        }    
        ans += ". Total time: " + times[num] + " minutes.";
        return ans;
    } 
    public static int inArrayList(String name, ArrayList<City> list){
        for(int i = 0; i< list.size(); i ++){
            if(list.get(i).getName().equals(name))
                return i;
        }    
        return -1;
    }    
}    

