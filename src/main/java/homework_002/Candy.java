package homework_002;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "candy")
public class Candy {
    String ingredients1;
    String ingredients2;
    String ingredients3;

    public Candy() {
    }

    public Candy(String ingredients1, String ingredients2, String ingredients3) {
        this.ingredients1 = ingredients1;
        this.ingredients2 = ingredients2;
        this.ingredients3 = ingredients3;
    }

    public Candy(String ingredients1, String ingredients2) {
        this.ingredients1 = ingredients1;
        this.ingredients2 = ingredients2;
    }

    public String getIngredients1() {
        return ingredients1;
    }

    @XmlElement(name = "ingredients_1")
    public void setIngredients1(String ingredients1) {
        this.ingredients1 = ingredients1;
    }

    public String getIngredients2() {
        return ingredients2;
    }

    @XmlElement(name = "ingredients_2")
    public void setIngredients2(String ingredients2) {
        this.ingredients2 = ingredients2;
    }

    public String getIngredients3() {
        return ingredients3;
    }

    @XmlElement(name = "ingredients_3")
    public void setIngredients3(String ingredients3) {
        this.ingredients3 = ingredients3;
    }

    @Override
    public String toString() {
        return "[" +ingredients1 +", " + ingredients2 + ", " + ingredients3 + "]";
    }
}
