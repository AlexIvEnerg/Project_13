public class User {
    private static String login = "Alex";
    private static String password = "nsij385";

    public static class Query {
        public void printToLog() {
            System.out.println("User with login: "+login+" and password: "+password+"sent a request");
        }
    }
    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
}
