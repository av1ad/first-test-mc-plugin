package me.aviad.lynx;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

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
