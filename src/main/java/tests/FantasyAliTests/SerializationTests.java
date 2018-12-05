package tests.FantasyAliTests;

import com.google.gson.Gson;
import domain.Pojos.PojoAllState;
import domain.Pojos.PojoReps;
import domain.Pojos.Representatives;
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
        repAlabama2.setName("R");
        //make a list fo alabamaReps
        listAlabamaReps.add(repAlabama1);
        listAlabamaReps.add(repAlabama1);

        // fill alabamaState info
        alabamaState.setState("Alabama");
        alabamaState.setReps(listAlabamaReps);

        //serialize with Gson
        Gson gson = new Gson();
        System.out.println(gson.toJson(alabamaState));
    }


}
