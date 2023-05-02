package XML;

import jakarta.xml.bind.JAXB;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


    public class AirlineXML {

        //singleton
        /*private static AirlineXML instance = null;

        private AirlineXML() {
        }

        public static AirlineXML getInstance() {
            if (instance == null) {
                instance = new AirlineXML();
            }
            return instance;
        }

        private Airline airline;

        public void loadFromXml(String filename){
            airline = JAXB.unmarshal(getClass().getClassLoader().getResourceAsStream(filename), Airline.class);
        }

        public List<Flight> flightsBetween(Instant from, Instant to){
            return airline.getRoutes().stream().flatMap( r -> r.getFlights().stream())
                    .filter( f -> f.getDepartureTime().isAfter(from) && f.getDepartureTime().isBefore(to)).toList();
        }

        public List<Flight> flightsDurationBetween(int from, int to){
            return airline.getRoutes().stream().flatMap( r -> r.getFlights().stream())
                    .filter( f -> f.getDuration() > from && f.getDuration() < to).toList();
        }

        public List<Flight> flightsWithPilot(String keyword){
            return airline.getRoutes().stream().flatMap( r -> r.getFlights().stream())
                    .filter( f -> f.getPilot().getName().toLowerCase().contains(keyword.toLowerCase())).toList();
        }

        public Map<String, List<Flight>> allFlightsForPilotGender(){
            return airline.getRoutes().stream().flatMap( r -> r.getFlights().stream())
                    .collect(
                            Collectors.groupingBy(f -> f.getPilot().getGender())
                    );
        }


        public Map<Route, Flight> longestFlightPerRoute(){
            return airline.getRoutes().stream().collect(
                    Collectors.toMap(r -> r,
                            r -> r.getFlights().stream().max((f1, f2) -> f1.getDuration() - f2.getDuration()).get()));
        }

        */
    }
