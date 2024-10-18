package semPadrao;

public class HandlerDemoWithoutChain {

    public static void handleRequest(String request) {
        if (request.equalsIgnoreCase("A")) {
            System.out.println("Handler A handled the request.");
        } else if (request.equalsIgnoreCase("B")) {
            System.out.println("Handler B handled the request.");
        } else if (request.equalsIgnoreCase("C")) {
            System.out.println("Handler C handled the request.");
        } else {
            System.out.println("Nenhum handler pode lidar com isso.");
        }
    }

    public static void main(String[] args) {
        handleRequest("A");  // Handler A handled the request.
        handleRequest("B");  // Handler B handled the request.
        handleRequest("C");  // Handler C handled the request.
        handleRequest("D");  // Nenhum handler pode lidar com isso.
    }
}
