package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;  //?
    private String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    //56fsd7
    public String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
//okkkkkkkkkkk
    @Override
    public String toString() {
        //test2ff111111111111111
	//test12332333333

        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
