/*
 *      Copyright (C) Jordan Erickson                     - 2014-2020,
 *      Copyright (C) Löwenfelsen UG (haftungsbeschränkt) - 2015-2020
 *       on behalf of Jordan Erickson.
 *
 * This file is part of Cool Mic.
 *
 * Cool Mic is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Cool Mic is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cool Mic.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package cc.echonet.coolmicapp.Icecast.Response;

public class Stats extends Response {
    private final int listenerCurrent;
    private final int listenerPeak;

    public Stats(int listenerCurrent, int listenerPeak) {
        this.listenerCurrent = listenerCurrent;
        this.listenerPeak = listenerPeak;
    }

    public int getListenerCurrent() {
        return listenerCurrent;
    }

    public int getListenerPeak() {
        return listenerPeak;
    }
}
