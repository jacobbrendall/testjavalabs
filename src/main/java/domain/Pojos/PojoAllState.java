package domain.Pojos;

import java.util.List;

public class PojoAllState {
    private String state;
    private List<PojoReps> reps;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PojoReps> getReps() {
        return reps;
    }

    public void setReps(List<PojoReps> reps) {
        this.reps = reps;
    }
}
