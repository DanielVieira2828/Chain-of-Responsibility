package comPadrao;
public class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("B")) {
            System.out.println("Handler B handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
