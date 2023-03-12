package org.cdiadev.cdiaghg

import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.plugin.java.JavaPlugin

/**
 * KotlinPluginTemplate plugin
 */
class Main : JavaPlugin() {

    override fun onEnable() {
        // ensure config file exists
        saveDefaultConfig()

        logger.info("${description.name} version ${description.version} enabled!")

        var pm = Bukkit.getPluginManager();
        pm.registerEvents(CdiaEventHandler(), this);
    }

    override fun onDisable() {
        logger.info("${description.name} disabled.")
    }


}
