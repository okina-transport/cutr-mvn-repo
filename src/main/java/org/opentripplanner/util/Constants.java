package org.opentripplanner.util;

public interface Constants {
    String GEO_JSON_POINT = "{\"type\": \"Point\", \"coordinates\": [";
    String GEO_JSON_TAIL = "]}";
    String POINT_PREFIX = "POINT(";
    int POINT_PREFIX_LEN = "POINT(".length();
    String POINT_SUFFIX = ")";
    int POINT_SUFFIX_LEN = ")".length();
    String POINT_SEPARATOR = " ";
}
