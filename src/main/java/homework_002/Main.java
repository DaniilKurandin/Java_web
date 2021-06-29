package homework_002;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        factory.add(new Candy("Chocolate", "Nougat", "Caramel"));
        factory.add(new Candy("Milk_chocolate", "Peanut", "Nougat"));
        factory.add(new Candy("Chocolate", "Marmalade"));


        try {
            File file = new File("D:\\java_web\\src\\main\\java\\homework_002\\candy.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Factory.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(factory, file);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            factory = (Factory) unmarshaller.unmarshal(file);
            System.out.println(factory);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
