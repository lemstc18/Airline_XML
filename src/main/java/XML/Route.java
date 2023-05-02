package XML;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)

public class Route {
    private String destination;
    private String departure;
    @XmlElementWrapper(name="flights")
    @XmlElement(name="flight")
    private List<Flight> flights;
}
