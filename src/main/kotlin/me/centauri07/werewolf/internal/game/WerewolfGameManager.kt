package me.centauri07.werewolf.internal.game

import me.centauri07.werewolf.api.game.Game
import me.centauri07.werewolf.api.manager.GameManager

/**
 * @author Centauri07
 */
object WerewolfGameManager: GameManager<WerewolfPlayer, WerewolfTeam> {

    private val games: MutableMap<String, Game<WerewolfPlayer, WerewolfTeam>> = mutableMapOf()

    override fun createGame(): Game<WerewolfPlayer, WerewolfTeam> {
        TODO("Not yet implemented")
    }

    override fun getGame(identifier: String): Game<WerewolfPlayer, WerewolfTeam> {
        TODO("Not yet implemented")
    }

    override fun getGame(player: WerewolfPlayer): Game<WerewolfPlayer, WerewolfTeam> {
        TODO("Not yet implemented")
    }
}