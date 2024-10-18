package comPadrao;
public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("A")) {
            System.out.println("Handler A handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
