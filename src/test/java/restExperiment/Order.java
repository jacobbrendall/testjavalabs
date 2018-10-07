package restExperiment;

public class Order implements Identifiable {

    private Long id;
    private String description;
    private Long costInCents;
    private  boolean isComplete;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id =id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(Long costInCents) {
        this.costInCents = costInCents;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public void markComplete() {
        setComplete(true);
    }

    public void markIncomplete() {
        setComplete(false);
    }
}
