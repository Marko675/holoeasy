package org.holoeasy

import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin
import org.holoeasy.pool.HologramPool
import org.holoeasy.pool.IHologramPool
import org.holoeasy.pool.InteractiveHologramPool

class HoloEasy : JavaPlugin() {

    companion object {
        @JvmField
        var useLastSupportedVersion: Boolean = false

        @JvmStatic
        fun startPool(plugin: Plugin, spawnDistance: Double): IHologramPool {
            val simplepool = HologramPool(plugin, spawnDistance)
            return simplepool
        }

        @JvmStatic
        fun startInteractivePool(
                plugin: Plugin, spawnDistance: Double,
                minHitDistance: Float, maxHitDistance: Float
        ): IHologramPool {
            val simplepool = HologramPool(plugin, spawnDistance)
            val interactivepool = InteractiveHologramPool(simplepool, minHitDistance, maxHitDistance)
            return interactivepool
        }
    }
}
