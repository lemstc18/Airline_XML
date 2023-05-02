package XML;

import jakarta.xml.bind.JAXB;

import java.io.InputStream;

public class XMLAccess {

    private static XMLAccess theInstance = null;


    public synchronized static XMLAccess getTheInstance() {
        if(theInstance==null) {
            theInstance = new XMLAccess();
        }
        return theInstance;
    }

    public static void setTheInstance(XMLAccess theInstance) {
        XMLAccess.theInstance = theInstance;
    }

    private XMLAccess() {

    }
    private Airline airline;

    public void loadFromXml(String filename){
        airline = JAXB.unmarshal(getClass().getClassLoader().getResourceAsStream(filename), Airline.class);
    }
    public Airline getAirline()
    {
        loadFromXml("airline.xml");
        return airline;
    }
    //As User I want to display all Routes in a dropdown ( GET /routes)
    //As User on selecting a Route all Flights should be present ( GET /routes/:id/flights )
    //As User I want to change ( PATCH /routes/:id/flights/:flightNumber ) the Pilot of a Flight by selecting a Flight and a Pilot ( GET /pilots ) from Dropdowns
    //As User I want to delete a flight from a route by clicking on a button next to the flight ( DELETE /routes/:id/fligths/:flightNumber )
    //As User I want to add additional Pilots to my database and save them to the xml file. ( POST /pilots )

}
