package dev.notmyfault.portalcreateeventpoc;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PortalCreateEventPoC extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Listener() {
            @EventHandler
            public void onPortalCreate(PortalCreateEvent event) {
                getLogger().info("PortalCreateEvent fired!");
            }
        }, this);
    }
}
