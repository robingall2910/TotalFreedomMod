package me.StevenLawson.TotalFreedomMod;

import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerListener;

class TotalFreedomModPlayerListener extends PlayerListener
{
    public static TotalFreedomMod plugin;
    private static final Logger log = Logger.getLogger("Minecraft");

    TotalFreedomModPlayerListener(TotalFreedomMod instance)
    {
        plugin = instance;
    }

    @Override
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event)
    {
        String command = event.getMessage();
        Player player = event.getPlayer();
        
        if (plugin.preprocessLogEnabled)
        {
            log.info(String.format("[PREPROCESS_COMMAND] %s(%s): %s", player.getName(), ChatColor.stripColor(player.getDisplayName()), command));
        }

        if (command.startsWith("/stop") && !command.equals("/stop"))
        {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Piss off.");
        }
        else if (command.startsWith("/zeus") || command.startsWith("/vulcan"))
        {
            event.setCancelled(true);
            player.sendMessage(ChatColor.RED + "Piss off.");
        }
    }
}