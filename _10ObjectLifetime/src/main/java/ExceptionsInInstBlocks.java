class RoomOccupancyTooHighException2
        extends Exception {}                    // (1) Checked exception
class BankruptcyException
        extends RuntimeException {}             // (2) Unchecked exception
//_______________________________________________________________________________
class Hotel2 {
    // Instance Members
    private boolean bankrupt         = true;
    private int     noOfRooms        = 215;
    private int     occupancyPerRoom = 5;
    private int     maxNoOfGuests;

    {                                           // (3) Instance initializer block
        try {                                     // (4) Handles checked exception
            if (occupancyPerRoom > 4)
                throw new RoomOccupancyTooHighException2();
        } catch (RoomOccupancyTooHighException2 exception) {
            System.out.println("ROOM OCCUPANCY TOO HIGH: " + occupancyPerRoom);
            occupancyPerRoom = 4;
        }
        maxNoOfGuests = noOfRooms * occupancyPerRoom;
    }

    {                                           // (5) Instance initializer block
        if (bankrupt)
            throw new BankruptcyException();         // (6) Throws unchecked exception
    }    // ...
}
//_______________________________________________________________________________
public class ExceptionsInInstBlocks {
    public static void main(String[] args) {
        new Hotel2();
    }
}