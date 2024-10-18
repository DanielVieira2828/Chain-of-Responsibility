package comPadrao;
public class ConcreteHandlerC extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("C")) {
            System.out.println("Handler C handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
