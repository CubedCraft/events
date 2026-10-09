package com.cubedcraft.events

class TWStateChangedEvent(val old: String?, val new: String, val playerID: String) : TWEvent() {
}