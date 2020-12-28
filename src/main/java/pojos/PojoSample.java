/**
 * This type of class is use to serialize Objects (JSON)
 */

package pojos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PojoSample {

    private String name;

    public PojoSample() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "{ \n \"name\": \""+name+"\" \n}";
    }
}
