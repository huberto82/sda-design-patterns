package decorator;

public class MessageDecorator extends AbstractMessageDecorator {

    public MessageDecorator(AbstractMessage message) {
        super(message);
    }

    @Override
    public String getMessage() {
        int cols = this.message.getMessage().length() + 4;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cols; i++){
            sb.append("*");
        }
        String result = sb.toString()+"\n";
        result += "* " + message.getMessage() + " *\n";
        result += sb.toString();
        return result;
    }
}
