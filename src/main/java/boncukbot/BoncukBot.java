package boncukbot;

import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class BoncukBot
{
    public static void main(String[] args) throws LoginException
    {
        final String TOKEN = "";
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);
        JDA jda = jdaBuilder.
                enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES).
                addEventListeners(new ReadyEventListener(), new MessageEventListener(), new InteractionEventListener()).
                build();

        jda.upsertCommand("slash-cmd", "this is a slash command").setGuildOnly(true).queue();
        jda.upsertCommand("husam-generate", "generate a husamviyuviyu catchphrase").setGuildOnly(true).queue();
        jda.upsertCommand("esra", "dünyanın en güzel insanı").setGuildOnly(true).queue();
    }
}
