package domain.Pojos;

import java.util.List;

public class AllStatesRepPojo {

    private String state;
    private List<Representatives> repsList;

    public AllStatesRepPojo(List<Representatives> repsList){
        this.repsList = repsList;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Representatives> getRepsList() {
        return repsList;
    }

    public void setRepsList(List<Representatives> repsList) {
        this.repsList = repsList;
    }

    @Override
    public String toString() {
        return String.format("{state:%s}", state);
    }
}
