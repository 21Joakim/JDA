/**
 *    Copyright 2015 Austin Keener & Michael Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dv8tion.jda.entities;

import java.util.List;

/**
 * Represents a Discord Voice Channel.
 *
 * Place holder for now until we implement voice support.
 */
public interface VoiceChannel
{
    /**
     * The Id of the {@link net.dv8tion.jda.entities.VoiceChannel VoiceChannel}. This is typically 18 characters long.
     *
     * @return
     *      Never-null String containing the {@link net.dv8tion.jda.entities.VoiceChannel VoiceChannel} id.
     */
    String getId();

    /**
     * The human readable name of the {@link net.dv8tion.jda.entities.VoiceChannel VoiceChannel}.
     *
     * @return
     *      Never-null String containing the {@link net.dv8tion.jda.entities.VoiceChannel VoiceChannel} name.
     */
    String getName();

    /**
     * Returns the {@link net.dv8tion.jda.entities.Guild Guild} that this {@link net.dv8tion.jda.entities.VoiceChannel VoiceChannel} is a part of.
     *
     * @return
     *      Never-null {@link net.dv8tion.jda.entities.Guild Guild} that this {@link net.dv8tion.jda.entities.VoiceChannel VoiceChannel} is a part of.
     */
    Guild getGuild();

    /**
     * An Immutable List of every {@link net.dv8tion.jda.entities.User User} that is currently connected to this {@link net.dv8tion.jda.entities.VoiceChannel VoiceChannel}.<br>
     * If there are none currently connected this List will be empty.
     *
     * @return
     *      List of all connected {@link net.dv8tion.jda.entities.User Users}.
     */
    List<User> getUsers();
}
