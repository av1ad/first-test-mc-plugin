package me.aviad.lynx;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class LynxPlugin extends SimplePlugin {

    /**
     * Automatically perform login ONCE when the plugin starts.
     */
    @Override
    protected void onPluginStart() {
    }

    /**
     * Automatically perform login when the plugin starts and each time it is reloaded.
     */
    @Override
    protected void onReloadablesStart() {

        // You can check for necessary plugins and disable loading if they are missing
        //Valid.checkBoolean(HookManager.isVaultLoaded(), "You need to install Vault so that we can work with packets, offline player data, prefixes and groups.");

        // Uncomment to load variables
        // Variable.loadVariables();

        //
        // Add your own plugin parts to load automatically here
        // Please see @AutoRegister for parts you do not have to register manually
        //
    }

    @Override
    protected void onPluginPreReload() {

        // Close your database here if you use one
        //YourDatabase.getInstance().close();
    }

    /* ------------------------------------------------------------------------------- */
    /* Events */
    /* ------------------------------------------------------------------------------- */

    @EventHandler
    public void onRightClick(final PlayerInteractEntityEvent event) {
        if (event.getRightClicked().getType() == EntityType.SPIDER)
            event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
    }

    /* ------------------------------------------------------------------------------- */
    /* Static */
    /* ------------------------------------------------------------------------------- */
	
    public static LynxPlugin getInstance() {
        return (LynxPlugin) SimplePlugin.getInstance();
    }
}
