package tests.FantasyAliTests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import domain.Pojos.PojoAllState;
import domain.Pojos.PojoReps;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SerializationTests {

    PojoReps repAlabama1 = new PojoReps();
    PojoReps repAlabama2 = new PojoReps();
    PojoAllState alabamaState = new PojoAllState();
    List<PojoReps> listAlabamaReps = new ArrayList<PojoReps>();

    @Test
    public void serialize() {

        //fill repAlabama1 info
        repAlabama1.setName("Tony");
        repAlabama1.setParty("D");
        //fill repAlabama2 info
        repAlabama2.setName("Jane");
        repAlabama2.setParty("R");
        //make a list fo alabamaReps
        listAlabamaReps.add(repAlabama1);
        listAlabamaReps.add(repAlabama2);

        // fill alabamaState info
        alabamaState.setState("Alabama");
        alabamaState.setReps(listAlabamaReps);

        System.out.println(serializeWithGson(alabamaState));

        System.out.println(serializeWithJackson(alabamaState));
    }

    private String serializeWithGson(Object obj) {
        return new Gson().toJson(obj);
    }

    private String serializeWithJackson(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        //mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
