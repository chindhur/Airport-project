# Airport-project
Class hierarchy diagram for Airport
Interface Details for Airport project:
1.Item interface in Person Package:
  Implemented addItem, removeItem , hasMetalObject and hasExplosiveObject in Passenger and Luggage classes.

2. SecurityCheck Interface in airport Package:
  Implementated ScanForSecurity and IsThreatDetected in MetalDetectorCheck and ExplosivedetectorCheck Classes.

3.RouteInterface in airport package:
 implemented getSource, getDestination, setDestination, getNoOfFlights,setNoOfFlights,printDetails in SFORoute,SingaporeRiute,TokyoRoute classes under Route package.

4. TicketCounter in airport package:
  implemented the methods in the above interface to AirportTicketCounter class.

5.Runway in airport package:
 Implemented  the methods in the above interface to AirportRunway class.


Final class , method and variables:
 
final variable:
NO_OF_WHEELS variable in flight class
SOURCE variable in SFORoute,SingaporeRoute,TokyoRoute

final method:
getNoOfWheels method in flight class

final class:
NoticeBoard, Luggage classes.


static Block:
Added static block in flight Class, Emirates,SingaporeAirlines,SouthwestAirlines and United Airlines Classes.

Static Variable:
added static variable noOfWings ,flightId and flightname in flight class.


