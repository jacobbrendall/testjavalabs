package domain.Pojos;

public class Representatives {

    //private String state;
    private String name;
    private String district;
    private String party;
    private String officeRoom;
    private String phone;
    private String committee_assignment;

    public Representatives(){

    }

    public Representatives (String name, String district, String party, String officeRoom, String phone, String committee_assignment){
        this.name = name;
        this.district = district;
        this.party = party;
        this.officeRoom = officeRoom;
        this.phone = phone;
        this.committee_assignment = committee_assignment;
    }

    @Override
    public String toString(){
        return name + " " + district + " " + party + " " + officeRoom + " " + phone + " " + committee_assignment;
    }

    /*public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }*/

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCommittee_assignment() {
        return committee_assignment;
    }

    public void setCommittee_assignment(String committee_assignment) {
        this.committee_assignment = committee_assignment;
    }



}
