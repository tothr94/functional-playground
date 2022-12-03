package countries.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;


/**
 * Egy országot ábrázoló osztály.
 */
@Builder
@Value
@With
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Country {

    /**
     * Az ország kódja (egyedi azonosítója).
     */
    @JsonProperty("alpha2Code")
    @EqualsAndHashCode.Include
    String code;
    /**
     * Az ország neve.
     */
    String name;
    /**
     * Az ország fővárosa.
     */
    String capital;
    /**
     * Az ország régiója.
     */
    Region region;
    /**
     * Az ország népessége.
     */
    long population;
    /**
     * Az ország területe.
     */
    BigDecimal area;
    /**
     * Az ország nevének fordításai különböző nyelveken.
     */
    Map<String, String> translations;
    /**
     * Az ország időzónái.
     */
    List<ZoneId> timezones;
}
