package XML;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAdapter extends XmlAdapter<String, LocalDateTime> {
    DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
    @Override
    public LocalDateTime unmarshal(String s) throws Exception {
        return LocalDateTime.parse(s,dtf);
    }

    @Override
    public String marshal(LocalDateTime localDate) throws Exception {
        return dtf.format(localDate);
    }
}
