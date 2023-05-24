package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class InteractionEventListener extends ListenerAdapter
{
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);

        switch (event.getName())
        {
            case "husam-generate":
                event.reply("Husamviyuviyu'nun linki: " + generateHusamLink()).setEphemeral(false).queue();
                break;
            case "slash-cmd":
                event.reply("These commands are a work in progress").setEphemeral(false).queue();
            case "esra":
                event.reply("bugün dünyanın en güzel insanı doğdu sen benim başıma gelen ve bu dünyaya gelen en güzel olay ve varlıksın her zaman benimle birlikte ol her zaman mutlu ol").setEphemeral(true).queue();
        }
    }


    public String generateHusamLink()
    {
        Random ran = new Random();

        int randomNumber = ran.nextInt(0,106);

        switch (randomNumber)
        {
            case 0:
                return "https://www.youtube.com/shorts/YtXjnbhEYZs";
            case 1:
                return  "https://www.youtube.com/shorts/8wD_qgFqhLg";
            case 2:
                return "https://www.youtube.com/shorts/Evd3MMJMpIA";
            case 3:
                return "https://www.youtube.com/shorts/lAXc3gvnwBs";
            case 4:
                return "https://www.youtube.com/shorts/x4aej0Ef0Ps";
            case 5:
                return "https://www.youtube.com/shorts/VU8WUyU6_Mo";
            case 6:
                return "https://www.youtube.com/shorts/3oYZ_UqHuDg";
            case 7:
                return "https://www.youtube.com/shorts/O2b4101ZlnA";
            case 8:
                return "https://www.youtube.com/shorts/C4mNGb7rrV8";
            case 9:
                return "https://www.youtube.com/shorts/ykAgJgp5PJY";
            case 10:
                return "https://www.youtube.com/shorts/Tt2Epdzdch4";
            case 11:
                return "https://www.youtube.com/shorts/kY9MeqZAB6g";
            case 12:
                return "https://www.youtube.com/shorts/MZf_dCqx0Zw";
            case 13:
                return "https://www.youtube.com/shorts/UD5jO_drlg0";
            case 14:
                return "https://www.youtube.com/shorts/p9awWg-QYnQ";
            case 15:
                return "https://www.youtube.com/shorts/x6qFokgSpBo";
            case 16:
                return "https://www.youtube.com/shorts/N5F11jEXfQ4";
            case 17:
                return "https://www.youtube.com/shorts/M8-VMCs1LGI";
            case 18:
                return "https://www.youtube.com/shorts/70UW7_aq-2M";
            case 19:
                return "https://www.youtube.com/shorts/8InAYHSl8rE";
            case 20:
                return "https://www.youtube.com/shorts/wol25S3eIdQ";
            case 21:
                return "https://www.youtube.com/shorts/V0ZLpDQS0sQ";
            case 22:
                return "https://www.youtube.com/shorts/5mhxB_5stqU";
            case 23:
                return "https://www.youtube.com/shorts/dmPOMdp4x3s";
            case 24:
                return "https://www.youtube.com/shorts/R0tU5_aW8vw";
            case 25:
                return "https://www.youtube.com/shorts/3AatGghZfyg";
            case 26:
                return "https://www.youtube.com/shorts/tiu7uUrltmk";
            case 27:
                return "https://www.youtube.com/shorts/QeAxWeHSgP4";
            case 28:
                return "https://www.youtube.com/shorts/JrIhGwe1EW4";
            case 29:
                return "https://www.youtube.com/shorts/XVuwyfOgIvA";
            case 30:
                return "https://www.youtube.com/shorts/vX3J-zKR6C4";
            case 31:
                return "https://www.youtube.com/shorts/9B4mK1NnR2M";
            case 32:
                return "https://www.youtube.com/shorts/jDJ_atxEOx4";
            case 33:
                return "https://www.youtube.com/shorts/cqUNvxLZH0E";
            case 34:
                return "https://www.youtube.com/shorts/LVD9wUQMos0";
            case 35:
                return "https://www.youtube.com/shorts/x4RMsR-9aJs";
            case 36:
                return "https://www.youtube.com/shorts/6yXpDg50Jb8";
            case 37:
                return "https://www.youtube.com/shorts/hUGyoyc-Wl4";
            case 38:
                return "https://www.youtube.com/shorts/Qw2xyqyeTXQ";
            case 39:
                return "https://www.youtube.com/shorts/R5ZVJDX8K-8";
            case 40:
                return "https://www.youtube.com/shorts/0BEh7YzTpeE";
            case 41:
                return "https://www.youtube.com/shorts/OOvnqJu0sVc";
            case 42:
                return "https://www.youtube.com/shorts/cu4T9BB0Z60";
            case 43:
                return "https://www.youtube.com/shorts/5kkg4ll-75k";
            case 44:
                return "https://www.youtube.com/shorts/glPKdoYgOGM";
            case 45:
                return "https://www.youtube.com/shorts/oDyb5juRIlE";
            case 46:
                return "https://www.youtube.com/shorts/J-kK-nFXXOk";
            case 47:
                return "https://www.youtube.com/shorts/NlImXlsS1Ck";
            case 48:
                return "https://www.youtube.com/shorts/3PtEyXfqiUo";
            case 49:
                return "https://www.youtube.com/shorts/5f3YOjSJxO4";
            case 50:
                return "https://www.youtube.com/shorts/C81Qbyskea8";
            case 51:
                return "https://www.youtube.com/shorts/GfxgzQWgQbI";
            case 52:
                return "https://www.youtube.com/shorts/6pW4mISgARU";
            case 53:
                return "https://www.youtube.com/shorts/EISlWwEnV-4";
            case 54:
                return "https://www.youtube.com/shorts/TVPqXfbKO7c";
            case 55:
                return "https://www.youtube.com/shorts/OEzdNDci2fk";
            case 56:
                return "https://www.youtube.com/shorts/ZspEUasZWpg";
            case 57:
                return "https://www.youtube.com/shorts/44CFAa2II6I";
            case 58:
                return "https://www.youtube.com/shorts/5LF1C-mXtMA";
            case 59:
                return "https://www.youtube.com/shorts/iSEVaPWxshI";
            case 60:
                return "https://www.youtube.com/shorts/lzYeNIbGcHA";
            case 61:
                return "https://www.youtube.com/shorts/PfkvPk5iDj8";
            case 62:
                return "https://www.youtube.com/shorts/WeqRtPqe11Y";
            case 63:
                return "https://www.youtube.com/shorts/DIMK_MVGShM";
            case 64:
                return "https://www.youtube.com/shorts/afXLMqF1C0Q";
            case 65:
                return "https://www.youtube.com/shorts/Idmk2sPaozw";
            case 66:
                return "https://www.youtube.com/shorts/Q01YdGK6jQU";
            case 67:
                return "https://www.youtube.com/shorts/r4BArWtg-gw";
            case 68:
                return "https://www.youtube.com/shorts/lFP15xr8eXg";
            case 69:
                return "https://www.youtube.com/shorts/xC_LgfZK2Gw";
            case 70:
                return "https://www.youtube.com/shorts/jSneCTaGG90";
            case 71:
                return "https://www.youtube.com/shorts/oC9ggYv2iB8";
            case 72:
                return "https://www.youtube.com/shorts/NZ8ZzlCa47I";
            case 73:
                return "https://www.youtube.com/shorts/kogxDtYZqOo";
            case 74:
                return "https://www.youtube.com/shorts/JZzHKAm9TEc";
            case 75:
                return "https://www.youtube.com/shorts/yUu8GUO9IGo";
            case 76:
                return "https://www.youtube.com/shorts/5sfrO2mAEqQ";
            case 77:
                return "https://www.youtube.com/shorts/Rk1bpQ8KVTs";
            case 78:
                return "https://www.youtube.com/shorts/NyYUx2PKxRU";
            case 79:
                return "https://www.youtube.com/shorts/zVjQWbeutyE";
            case 80:
                return "https://www.youtube.com/shorts/xBiHOefxQVc";
            case 81:
                return "https://www.youtube.com/shorts/KXaBzUQeDiQ";
            case 82:
                return "https://www.youtube.com/shorts/_eryEEXh2xY";
            case 83:
                return "https://www.youtube.com/shorts/P1crRS5papo";
            case 84:
                return "https://www.youtube.com/shorts/lYMx4Oo4vV8";
            case 85:
                return "https://www.youtube.com/shorts/IaZ9I6zKfOk";
            case 86:
                return "https://www.youtube.com/shorts/iMZDjiESs7E";
            case 87:
                return "https://www.youtube.com/shorts/ALA1dUmxRx4";
            case 88:
                return "https://www.youtube.com/shorts/KLqkhASGEII";
            case 89:
                return "https://www.youtube.com/shorts/ZNU3hNOlmIU";
            case 90:
                return "https://www.youtube.com/shorts/wVEJ0OwpCf0";
            case 91:
                return "https://www.youtube.com/shorts/JWkMshimo-k";
            case 92:
                return "https://www.youtube.com/shorts/Y9W0ugwovw0";
            case 93:
                return "https://www.youtube.com/shorts/5pUcPpmnxZE";
            case 94:
                return "https://www.youtube.com/shorts/mnNNHnP8Klw";
            case 95:
                return "https://www.youtube.com/shorts/Q3IeMou8NtU";
            case 96:
                return "https://www.youtube.com/shorts/LdndS1e06Zw";
            case 97:
                return "https://www.youtube.com/shorts/36KPKaDvDuc";
            case 98:
                return "https://www.youtube.com/shorts/lIjlbb7c_d4";
            case 99:
                return "https://www.youtube.com/shorts/b0FVsRP4gvk";
            case 100:
                return "https://www.youtube.com/shorts/UPy_0Bh1olw";
            case 101:
                return "https://www.youtube.com/shorts/ko0KkXSEHhY";
            case 102:
                return "https://www.youtube.com/shorts/2-4g2OpNluk";
            case 103:
                return "https://www.youtube.com/shorts/DfWMIHFQrUc";
            case 104:
                return "https://www.youtube.com/shorts/ce5_Xt86efU";
            case 105:
                return "https://www.youtube.com/shorts/W8Zq2gYdQy4";
            case 106:
                return "https://www.youtube.com/shorts/n2P_gigP-rI";
            default:
                return "boncuk bulamadı";
        }
    }
}
