package org.opentripplanner.common;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

public class MavenVersion implements Serializable {
    public final String version;
    public final int major;
    public final int minor;
    public final int incremental;
    public final String qualifier;
    public final String commit;
    public final String describe;
    public final String commit_time;
    public final String build_time;

    private static MavenVersion fromProperties() {
        String var0 = "maven-version.properties";

        try {
            Properties props = new Properties();
            InputStream in = MavenVersion.class.getClassLoader().getResourceAsStream("maven-version.properties");
            props.load(in);
            MavenVersion version = new MavenVersion(props.getProperty("project.version"), props.getProperty("git.commit.id"), props.getProperty("git.commit.id.describe"), props.getProperty("git.commit.time"), props.getProperty("git.build.time"));
            return version;
        } catch (Exception var4) {
            return new MavenVersion();
        }
    }

    private MavenVersion() {
        this("0.0.0-ParseFailure", "UNKNOWN", "UNKNOWN", "UNKNOWN", "UNKNOWN");
    }

    public MavenVersion(String version, String commit, String describe, String commit_time, String build_time) {
        this.version = version;
        String[] fields = version.split("\\-");
        if (fields.length > 1) {
            this.qualifier = fields[1];
        } else {
            this.qualifier = "";
        }

        fields = fields[0].split("\\.");
        if (fields.length > 0) {
            this.major = Integer.parseInt(fields[0]);
        } else {
            this.major = 0;
        }

        if (fields.length > 1) {
            this.minor = Integer.parseInt(fields[1]);
        } else {
            this.minor = 0;
        }

        if (fields.length > 2) {
            this.incremental = Integer.parseInt(fields[2]);
        } else {
            this.incremental = 0;
        }

        this.commit = commit;
        this.describe = describe;
        this.commit_time = commit_time;
        this.build_time = build_time;
    }

    public String toString() {
        return String.format("MavenVersion(%d, %d, %d, %s, %s)", this.major, this.minor, this.incremental, this.qualifier, this.commit);
    }

    public int hashCode() {
        return (this.qualifier.equals("SNAPSHOT") ? -1 : 1) * (1000000 * this.major + 1000 * this.minor + this.incremental);
    }

    public boolean equals(Object other) {
        if (!(other instanceof MavenVersion)) {
            return false;
        } else {
            MavenVersion that = (MavenVersion)other;
            return this.major == that.major && this.minor == that.minor && this.incremental == that.incremental && this.qualifier.equals(that.qualifier);
        }
    }
}
