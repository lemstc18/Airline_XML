package XML;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Flight {
    //<flightNumber>3601</flightNumber>
    //          <departureTime>2022-11-07T01:44:34Z</departureTime>
    //          <duration>262</duration>
    //          <pilot title="Dr">
    //            <gender>Female</gender>
    //            <name>Lindy Rosell</name>
    //          </pilot>
    @XmlElement(name="flightNumber")
    private int flightNumber;
    @XmlElement(name="duration")
    private int duration;
    @XmlElement(name="pilot")
    private Pilot pilot;
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private LocalDateTime departureTime;
}
