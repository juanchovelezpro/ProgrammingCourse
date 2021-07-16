package clases.clase6;

public class Heladeria {

    private String name;
    private String optionsIceCreams;

    public Heladeria(String name, String optionsIceCreams){

        this.name = name;
        this.optionsIceCreams = optionsIceCreams;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getOptionsIceCreams(){
        return optionsIceCreams;
    }

    public void setOptionsIceCreams(String optionsIceCreams){
        this.optionsIceCreams = optionsIceCreams;
    }
}
