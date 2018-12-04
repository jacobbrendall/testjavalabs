package domain.Pojos;

import java.util.List;

public class PojoRepList {
    private String state;
    private List<String> name;
    private List<String> district;
    private List<String> party;
    private List<String> officeRoom;
    private List<String> phone;
    private List<String> committee_assignment;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getDistrict() {
        return district;
    }

    public void setDistrict(List<String> district) {
        this.district = district;
    }

    public List<String> getParty() {
        return party;
    }

    public void setParty(List<String> party) {
        this.party = party;
    }

    public List<String> getOfficeRoom(){return officeRoom;}

    public void setOfficeRoom(List<String> officeRoom) {
        this.officeRoom = officeRoom;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List<String> getCommittee_assignment() {
        return committee_assignment;
    }

    public void setCommittee_assignment(List<String> committee_assignment) {
        this.committee_assignment = committee_assignment;
    }
}
