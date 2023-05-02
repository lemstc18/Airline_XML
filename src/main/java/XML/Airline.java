package XML;

import jakarta.xml.bind.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="airline")
public class Airline {
    @XmlElementWrapper(name="routes")
    @XmlElement(name="route")
    private List<Route> routes;
}
