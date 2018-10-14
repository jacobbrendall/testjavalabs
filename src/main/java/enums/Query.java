package enums;

public enum Query {
    REPID("SELECT FIRST_NAME FROM REPRESENTATIVES WHERE REP_ID = ?");

    private String query;

    Query(String query) {this.query = query;}

    public String getQuery() {return query; }

}
