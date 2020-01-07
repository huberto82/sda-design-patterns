package decorator;

abstract public class AbstractMessageDecorator extends AbstractMessage{
    protected AbstractMessage message;
    public AbstractMessageDecorator(AbstractMessage message) {
        this.message = message;
    }
}
