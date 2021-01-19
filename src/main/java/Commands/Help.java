import java.awt.Color;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Help extends ListenerAdapter {
  
  @Override
  public void onMessageReceived(MessageReceivedEvent event) {
    Message msg = event.getMessage();
      if(msg.getContentRaw().equals(Constants.PREFIX + "help")){
        EmbedBuilder embedBuilder = new EmbedBuilder();
        msg.getChannel().sendMessage(createEmbed()).queue();
      }
    }

  public MessageEmbed createEmbed(){
    EmbedBuilder EmbedBuilder = new EmbedBuilder();
    EmbedBuilder.setThumbnail("https://cdn.discordapp.com/avatars/783265564658892800/6bec20f36082ad5950b60422fbec802e.png?size=256");
    EmbedBuilder.setAuthor("Welcome to the Coder.Jorney Server",null,  "https://cdn.discordapp.com/avatars/783265564658892800/6bec20f36082ad5950b60422fbec802e.png?size=256");
    EmbedBuilder.setColor(new Color(116, 139, 212));
    EmbedBuilder.setDescription("1. To get the question asked on the respective day.```.p[problem number]```For example, to get the problem asked on Day 24, type ```.p24``` \n"+
                                "2. To get all the commands of Flash, type ```.help```\n"+
                                "3. To get the github repository of Flash, type ```.source```\n");
    return EmbedBuilder.build();
  }
}