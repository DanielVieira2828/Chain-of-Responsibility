package comPadrao;
public class ChainDemo {
    public static void main(String[] args) {
        // Criando os handlers
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        // Definindo a cadeia de responsabilidade
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        // Testando diferentes requests
        handlerA.handleRequest("A");  // Handler A handled the request.
        handlerA.handleRequest("B");  // Handler B handled the request.
        handlerA.handleRequest("C");  // Handler C handled the request.
        handlerA.handleRequest("D");  // Nenhum handler pode lidar com isso.
    }
}
