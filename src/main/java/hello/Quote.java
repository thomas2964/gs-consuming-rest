package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//import java.util.LinkedList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;
    private List<Integer> list =new LinkedList<>();
    Map<String, Integer> map=new HashMap<>();

    public Quote() {
    }

    public String getType() {
        return type;
    }

    //more and more and more
    //more22222
    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
	//hellorrrrrrrrrrrrrrrrr
        //ok123:wq:wqtttttttttt
        //2
        //999/
        //888
	//1
	//2
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
