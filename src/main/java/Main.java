import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.entities.Activity;

public class Main extends ListenerAdapter {
  public static void main(String[] args){

    JDABuilder jda = JDABuilder.createDefault(Constants.TOKEN);
    jda.addEventListeners(new Main(), new Problem(), new Help(), new Source());
    jda.setActivity(Activity.playing("coder.journey | .help"));
    try{
      jda.build();
    }
    catch(LoginException exception){
     exception.printStackTrace();
    }

  }

}