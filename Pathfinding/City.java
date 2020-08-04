import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Connection> connections;
    
    public City (String newName){
        name = newName;
        connections = new ArrayList<Connection>();
    }
    
    
    public void addConnection(City otherCity, int distance){
        connections.add(new Connection(otherCity, distance));
    }
    
    
    public String getName(){
        return name;
    }
    public ArrayList<Connection> getConnections(){
        return connections;
    }
    
}
