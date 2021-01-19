import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.Activity;

public class Main extends ListenerAdapter {
  public static void main(String[] args){

    JDABuilder JDA = JDABuilder.createDefault(Constants.TOKEN);
    JDA.addEventListeners(new Main(), new Problem(), new Help(), new Source());
    JDA.setActivity(Activity.playing("coder.journey | .help"));
    try{
      JDA.build();
    }
    catch(LoginException exception){
     exception.printStackTrace();
    }

  }

}