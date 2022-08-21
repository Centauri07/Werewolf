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

package me.centauri07.werewolf.api.phase

import me.centauri07.werewolf.api.player.Player
import me.centauri07.werewolf.api.team.Team

/**
 * @author Centauri07
 */
interface Phase<P: Player, T: Team<P>> {

    val nextPhase: Phase<P, T>?

    fun initialize()
    fun end()

}