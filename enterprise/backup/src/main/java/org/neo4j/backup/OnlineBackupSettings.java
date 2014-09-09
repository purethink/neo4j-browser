/**
 * Copyright (c) 2002-2014 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.backup;

import static org.neo4j.graphdb.factory.GraphDatabaseSetting.TRUE;
import static org.neo4j.helpers.Settings.BOOLEAN;
import static org.neo4j.helpers.Settings.HOSTNAME_PORT;
import static org.neo4j.helpers.Settings.INTEGER;
import static org.neo4j.helpers.Settings.setting;

import org.neo4j.graphdb.config.Setting;
import org.neo4j.graphdb.factory.Description;
import org.neo4j.helpers.HostnamePort;

/**
 * Settings for online backup
 */
public class OnlineBackupSettings
{

    @Description("Enable support for running online backups")
    public static final Setting<Boolean> online_backup_enabled = setting( "online_backup_enabled", BOOLEAN, TRUE );

    @Deprecated
    @Description("Listening port for online backups. Replaced by online_backup_server")
    public static final Setting<Integer> online_backup_port = setting( "online_backup_port", INTEGER, "6362" );

    @Description("Listening server for online backups")
    public static final Setting<HostnamePort> online_backup_server = setting( "online_backup_server", HOSTNAME_PORT,
            "0.0.0.0:6362-6372" );
}