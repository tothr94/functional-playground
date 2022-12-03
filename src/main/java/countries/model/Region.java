package countries.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import countries.base.RegionDeserializer;
import countries.base.RegionSerializer;

/**
 * A régió értékeit leíró értékek.
 */
@JsonSerialize(using = RegionSerializer.class)
@JsonDeserialize(using = RegionDeserializer.class)
public enum Region {

    /**
     * Afrikai régió.
     */
    @JsonProperty("Africa") AFRICA,
    /**
     * Amerikai régió.
     */
    @JsonProperty("Americas") AMERICAS,
    /**
     * Ázsiai régió.
     */
    @JsonProperty("Asia") ASIA,
    /**
     * Európai régió.
     */
    @JsonProperty("Europe") EUROPE,
    /**
     * Óceániai régió.
     */
    @JsonProperty("Oceania") OCEANIA,
    /**
     * Sarkköri régió.
     */
    @JsonProperty("Polar") POLAR,
    /**
     * Ismeretlen régió.
     */
    @JsonProperty("") UNSPECIFIED;

}