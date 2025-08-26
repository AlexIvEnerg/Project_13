public class User {
    private String login;
    private String password;

    public void createQuery() {
        login = "Alex";
        password = "nsij385";
        class Query {
            public void printToLog() {
                System.out.println("User with login: " + login + " and password: " + password + "sent a request");
            }
        }
        Query query = new Query();
        query.printToLog();
    }
}
