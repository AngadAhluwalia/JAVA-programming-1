
import java.util.ArrayList;

public class MessagingServices {
    ArrayList<Message>messages;

    public MessagingServices() {
        messages=new ArrayList<>();
    }
    public void add(Message message){
        if(!(message.getContent().length()>280))
        messages.add(message);
    }
    public ArrayList<Message> getMessages(){
        return messages;
    }
    

}
