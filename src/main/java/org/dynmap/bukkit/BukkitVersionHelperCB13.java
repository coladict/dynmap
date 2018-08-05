package org.dynmap.bukkit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.bukkit.ChunkSnapshot;
import org.dynmap.Log;

public class BukkitVersionHelperCB13 extends BukkitVersionHelperCB {
    /**
     * Get block ID from snapshot
     */
    public int getBlockIDFromSnap(ChunkSnapshot css, int x, int y, int z) {
    	int v = css.getBlockType(x,  y,  z).getId();
    	return v;
    }
}
