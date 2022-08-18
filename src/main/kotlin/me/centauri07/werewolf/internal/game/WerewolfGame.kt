/*
 *  Copyright 2022 Centauri07
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package me.centauri07.werewolf.internal.game

import me.centauri07.werewolf.api.game.Game

/**
 * @author Centauri07
 */
class WerewolfGame: Game<WerewolfPlayer, WerewolfTeam> {
    override val identifier: String
        get() = TODO("Not yet implemented")

    override fun getPlayers(): List<WerewolfPlayer> {
        TODO("Not yet implemented")
    }

    override fun addPlayer(player: WerewolfPlayer) {
        TODO("Not yet implemented")
    }

    override fun removePlayer(player: WerewolfPlayer) {
        TODO("Not yet implemented")
    }

    override fun getAlivePlayers(): List<WerewolfPlayer> {
        TODO("Not yet implemented")
    }

    override fun getSpectatingPlayers(): List<WerewolfPlayer> {
        TODO("Not yet implemented")
    }

    override fun getTeams(): List<WerewolfTeam> {
        TODO("Not yet implemented")
    }

    override fun getTeamOfPlayer(player: WerewolfPlayer) {
        TODO("Not yet implemented")
    }

    override fun initialize() {
        TODO("Not yet implemented")
    }

    override fun end() {
        TODO("Not yet implemented")
    }
}