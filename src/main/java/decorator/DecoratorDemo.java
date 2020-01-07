package decorator;

/**
 * AbstractMessage - klasa abstrakcyjna przechowuje komunikat z metodą abstrakcyjną getMessage
 * Message - klasa konkretnego komunikatu z zaimplementowaną metodą getMessage
 * AbstractMessageDecorator - klasa abstrakcyjna dekoratora z metodą abstrakcyjną getMessage (taka sama jak w dekorowanej klasie) i polem typu
 * AbstractMessage
 * MessageDecorator - konkretny dekorator, który dodaje do komunikatu ramkę
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        AbstractMessage message = new Message("Hello World!!!!");
        AbstractMessage decoratedMessage = new MessageDecorator(message);
        System.out.println("Komunikat bez dekoratora");
        System.out.println(message.getMessage());
        System.out.println("Komunikat z dekoracją");
        System.out.println(decoratedMessage.getMessage());
    }
}
