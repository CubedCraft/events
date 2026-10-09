package com.cubedcraft.events

import org.bukkit.event.Event
import org.bukkit.event.HandlerList

open class TWEvent : Event() {
    override fun getHandlers(): HandlerList {
        return HANDLERS
    }

    companion object {
        // Döp om variabeln till HANDLERS (och gör den gärna private)
        private val HANDLERS = HandlerList()

        @JvmStatic
        fun getHandlerList(): HandlerList {
            return HANDLERS
        }
    }
}