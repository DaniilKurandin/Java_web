package homework_002;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "factory")
public class Factory {

    @XmlElement(name = "candy")
    private List<Candy> candies = new ArrayList<>();

    public void add(Candy candy) {
        candies.add(candy);
    }
}