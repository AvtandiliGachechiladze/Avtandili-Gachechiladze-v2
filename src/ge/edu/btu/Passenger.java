package ge.edu.btu;

public class Passenger {
    private final String name;
    private final boolean ticket;

    public Passenger(String name, boolean ticket){
        this.name = name;
        this.ticket = ticket;
    }

    public String getName(){
        return name;
    }

    public boolean haveTicket(){
        return ticket;
    }
}
