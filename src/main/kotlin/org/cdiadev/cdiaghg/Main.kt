package org.cdiadev.cdiaghg

import org.bukkit.plugin.java.JavaPlugin

/**
 * KotlinPluginTemplate plugin
 */
class Main : JavaPlugin() {

    override fun onEnable() {
        // ensure config file exists
        saveDefaultConfig()

        logger.info("${description.name} version ${description.version} enabled!")
        logger.info("Dummy change so it works")
    }

    override fun onDisable() {
        logger.info("${description.name} disabled.")
    }
}
