package org.opentripplanner.api.resource;

import org.opentripplanner.common.MavenVersion;

public class ServerInfo {
    public MavenVersion serverVersion;
    public String cpuName = "unknown";
    public int nCores = 0;

    public ServerInfo() {
    }
}
