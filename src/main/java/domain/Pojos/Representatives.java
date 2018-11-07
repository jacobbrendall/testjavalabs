package domain.Pojos;

public class Representatives {

    private String state;
    private String name;
    private String district;
    private char party;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public char getParty() {
        return party;
    }

    public void setParty(char party) {
        this.party = party;
    }
}
