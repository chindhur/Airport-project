package task2.airport;

public class NoticeBoard {
    Flight flightDetails;

    public NoticeBoard() {
    }

    public void setFlightDetails(Flight flightDetails) {
        this.flightDetails = flightDetails;
        return;
    }

    public void printFlightDetails() {
        System.out.println("flightID : " + flightDetails.getFlightId());
        System.out.println("flightName : " + flightDetails.getFlightName());
        System.out.println("flightSource : " + flightDetails.getSource());
        System.out.println("flightDestination : " + flightDetails.getDestination());
        System.out.println("flightArrivalTime : " + flightDetails.getArrivalTime());
        System.out.println("flightDepartureTime : " + flightDetails.getDepartureTime());
        return;
    }
}