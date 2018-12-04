package domain.Pojos;

public class Representatives {

    private String state;
    private String name;
    private String district;
    private String party;
    private String officeRoom;

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

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getOfficeRoom(){return officeRoom;}

    public void setOfficeRoom(String officeRoom) {
        this.officeRoom = officeRoom;
    }
}
