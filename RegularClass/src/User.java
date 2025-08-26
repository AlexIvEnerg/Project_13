public class User {
    private String login;
    private String password;

    public class Query {
        public void printToLog() {
            login = "Alex"; password = "nsij385";
            System.out.println("User with login: "+login+" and password: "+password+"sent a request");
        }
    }
    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }


}
