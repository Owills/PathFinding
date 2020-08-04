
public class Connection {
    private City destination;
    private int driveTime;
    
    public Connection(City targetCity, int time){
        destination = targetCity;
        driveTime = time;
    }
    
    public City getDestination(){
        return destination;
    }
    public int getDriveTime(){
        return driveTime;
    }
}
