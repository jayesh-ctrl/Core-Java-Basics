// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashSet;
// import java.util.LinkedList;
import java.util.*;

// import Threatre.Seat;

class Threatre{
    private final String threatreName;
    public List<Seat> seats = new ArrayList<>();

    public Threatre(String threatreName,int numRows,int seatsPerRow)
    {
        this.threatreName = threatreName;
        int lastRow = 'A' + (numRows-1);
        for(char row='A';row<=lastRow;row++)
        {
            for(int seatNum = 1;seatNum<=seatsPerRow;seatNum++)
            {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName(){
        return threatreName;
    }

    public boolean reserveSeat(String seatNumber)
    {
        int low=0,high = seats.size()-1;
        while(low<=high)
        {
            System.out.println(".");
            int mid = (low+high)/2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if(cmp<0)
            {
                low = mid+1;
            }
            else if(cmp > 0)
            {
                high = mid-1;

            }
            else{
                return seats.get(mid).reserve();
            }
        }
            System.out.println("There is no seat " + seatNumber);
            return false;
        

        // for(Seat seat:seats)
        // {
        //     System.out.print(".");
        //     if(seat.getSeatNumber().equals(seatNumber))
        //     {
        //         requestedSeat = seat;
        //         break;
        //     }
        // }
        // if(requestedSeat == null)
        // {
        //     System.out.println("There is no seat "+seatNumber);
        //     return false;
        // }
        // return requestedSeat.reserve();
    }

    public void getSeats()
    {
        for(Seat seat : seats)
        {
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber)
        {
            this.seatNumber = seatNumber;
        }

        public int compareTo(Seat seat)
        {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }


        public boolean reserve()
        {
            if(!this.reserved)
            {
                this.reserved = true;
                System.out.println("Seat: "+seatNumber+" reserved");
                return true;
            }
            else
            {
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved)
            {
                this.reserved = false;
                System.out.println("Reservation of seat "+seatNumber+" cancelled");
                return true;
            }
            else{
                return false;
            }
        }

        public String getSeatNumber(){
            return seatNumber;
        }

    }

}
public class Udemy_Collection {
    public static void main(String[] args) {

        Threatre threatre = new Threatre("Olympian", 8, 12);


        List<Threatre.Seat> seatCopy = new ArrayList<>(threatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();

        if(threatre.reserveSeat("A02"))
        {
            System.out.println("Please pay for A02");
        }
        else{
            System.out.println("Seat Already reserved");
        }
        java.util.Collections.reverse(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);

        System.out.println("Printing threatre.seat");
        printList(threatre.seats);

        Threatre.Seat minSeat = java.util.Collections.min(seatCopy);
        Threatre.Seat maxSeat = java.util.Collections.max(seatCopy);
        System.out.println("Min seat Number is "+minSeat.getSeatNumber());
        System.out.println("Max seat Number is "+maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);

        // threatre.getSeats();

        // if(threatre.reserveSeat("H11"))
        // {
        //     System.out.println("Please pay");
        // }
        // else{
        //     System.out.println("Sorry, seat is taken");
        // }

        // if(threatre.reserveSeat("H11"))
        // {
        //     System.out.println("Please pay");
        // }
        // else{
        //     System.out.println("Sorry, seat is taken");
        // }
        
    }
    public static void printList(List<Threatre.Seat> list)
    {
        for(Threatre.Seat seat : list)
        {
            System.out.println(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=============");

    }

    public static void sortList(List<? extends Threatre.Seat> list)
    {
        for(int i=0;i<list.size()-1;i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).compareTo(list.get(j)) > 0)
                {
                    java.util.Collections.swap(list, i, j); 

                }
            }
        }
    }

}
