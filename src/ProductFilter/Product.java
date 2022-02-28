package ProductFilter;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private Colour color;
    private Size size;
    private String name;

    public Product(Colour color, Size size, String name){
        this.color =  color;
        this.size = size;
        this.name = name;
    }

    public void setColor(Colour color){
        this.color = color;
    }

    public Colour getColor(){
        return color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
