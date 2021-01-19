import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Source extends ListenerAdapter{

  @Override
  public void onMessageReceived(MessageReceivedEvent event){
    Message msg = event.getMessage();
    if(msg.getContentRaw().equals(Constants.PREFIX + "source")){
      msg.getChannel().sendMessage("https://github.com/AbdulKalam21/Flash").queue();
    }
  }

}