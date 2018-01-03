/**
 * Betfair: Exchange Streaming API
 * API to receive streamed updates. This is an ssl socket connection of CRLF delimited json messages (see RequestMessage & ResponseMessage)
 *
 * OpenAPI spec version: 1.0.1423
 * Contact: bdp@betfair.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package cc.xuloo.betfair.client.stream;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;
import org.joda.time.DateTime;

import java.util.List;


/**
 * MarketDefinition
 */
@Value
public class MarketDefinition   {

    /**
    * Gets or Sets bettingType
    */
    public enum BettingTypeEnum {

        ODDS("ODDS"),
        LINE("LINE"),
        RANGE("RANGE"),
        ASIAN_HANDICAP_DOUBLE_LINE("ASIAN_HANDICAP_DOUBLE_LINE"),
        ASIAN_HANDICAP_SINGLE_LINE("ASIAN_HANDICAP_SINGLE_LINE");

        private String value;

        BettingTypeEnum(String value) {
          this.value = value;
        }

        @Override
        public String toString() {
      return String.valueOf(value);
    }
    }

    /**
    * Gets or Sets status
    */
    public enum Status {

        INACTIVE("INACTIVE"),
        OPEN("OPEN"),
        SUSPENDED("SUSPENDED"),
        CLOSED("CLOSED");

        private String value;

        Status(String value) {
          this.value = value;
        }

        @Override
        public String toString() {
      return String.valueOf(value);
    }
    }

    private final Status status;

    private final String venue;

    private final DateTime settledTime;

    private final String timezone;

    private final Double eachWayDivisor;

    private final List<String> regulators;

    private final String marketType;

    private final Double marketBaseRate;

    private final Integer numberOfWinners;

    private final String countryCode;

    private final Double lineMaxUnit;

    private final Boolean inPlay;

    private final Integer betDelay;

    private final Boolean bspMarket;

    private final BettingTypeEnum bettingType;

    private final Integer numberOfActiveRunners;

    private final Double lineMinUnit;

    private final String eventId;

    private final Boolean crossMatching;

    private final Boolean runnersVoidable;

    private final Boolean turnInPlayEnabled;

    private final PriceLadderDefinition priceLadderDefinition;

    private final KeyLineDefinition keyLineDefinition;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private final DateTime suspendTime;

    private final Boolean discountAllowed;

    private final Boolean persistenceEnabled;

    private final List<RunnerDefinition> runners;

    private final Long version;

    private final String eventTypeId;

    private final Boolean complete;

    private final DateTime openDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private final DateTime marketTime;

    private final Boolean bspReconciled;

    private final Double lineInterval;

    public MarketDefinition(@JsonProperty("status") Status status,
                            @JsonProperty("venue") String venue,
                            @JsonProperty("settledTime") DateTime settledTime,
                            @JsonProperty("timezone") String timezone,
                            @JsonProperty("eachWayDivisor") Double eachWayDivisor,
                            @JsonProperty("regulators") List<String> regulators,
                            @JsonProperty("marketType") String marketType,
                            @JsonProperty("marketBaseRate") Double marketBaseRate,
                            @JsonProperty("numberOfWinners") Integer numberOfWinners,
                            @JsonProperty("countryCode") String countryCode,
                            @JsonProperty("lineMaxUnit") Double lineMaxUnit,
                            @JsonProperty("inPlay") Boolean inPlay,
                            @JsonProperty("betDelay") Integer betDelay,
                            @JsonProperty("bspMarket") Boolean bspMarket,
                            @JsonProperty("bettingType") BettingTypeEnum bettingType,
                            @JsonProperty("numberOfActiveRunners") Integer numberOfActiveRunners,
                            @JsonProperty("lineMinUnit") Double lineMinUnit,
                            @JsonProperty("eventId") String eventId,
                            @JsonProperty("crossMatching") Boolean crossMatching,
                            @JsonProperty("runnersVoidable") Boolean runnersVoidable,
                            @JsonProperty("turnInPlayEnabled") Boolean turnInPlayEnabled,
                            @JsonProperty("priceLadderDefinition") PriceLadderDefinition priceLadderDefinition,
                            @JsonProperty("keyLineDefinition") KeyLineDefinition keyLineDefinition,
                            @JsonProperty("suspendTime") DateTime suspendTime,
                            @JsonProperty("discountAllowed") Boolean discountAllowed,
                            @JsonProperty("persistenceEnabled") Boolean persistenceEnabled,
                            @JsonProperty("runners") List<RunnerDefinition> runners,
                            @JsonProperty("version") Long version,
                            @JsonProperty("eventTypeId") String eventTypeId,
                            @JsonProperty("complete") Boolean complete,
                            @JsonProperty("openDate") DateTime openDate,
                            @JsonProperty("marketTime") DateTime marketTime,
                            @JsonProperty("bspReconciled") Boolean bspReconciled,
                            @JsonProperty("lineInterval") Double lineInterval) {
        this.status = status;
        this.venue = venue;
        this.settledTime = settledTime;
        this.timezone = timezone;
        this.eachWayDivisor = eachWayDivisor;
        this.regulators = regulators;
        this.marketType = marketType;
        this.marketBaseRate = marketBaseRate;
        this.numberOfWinners = numberOfWinners;
        this.countryCode = countryCode;
        this.lineMaxUnit = lineMaxUnit;
        this.inPlay = inPlay;
        this.betDelay = betDelay;
        this.bspMarket = bspMarket;
        this.bettingType = bettingType;
        this.numberOfActiveRunners = numberOfActiveRunners;
        this.lineMinUnit = lineMinUnit;
        this.eventId = eventId;
        this.crossMatching = crossMatching;
        this.runnersVoidable = runnersVoidable;
        this.turnInPlayEnabled = turnInPlayEnabled;
        this.priceLadderDefinition = priceLadderDefinition;
        this.keyLineDefinition = keyLineDefinition;
        this.suspendTime = suspendTime;
        this.discountAllowed = discountAllowed;
        this.persistenceEnabled = persistenceEnabled;
        this.runners = runners;
        this.version = version;
        this.eventTypeId = eventTypeId;
        this.complete = complete;
        this.openDate = openDate;
        this.marketTime = marketTime;
        this.bspReconciled = bspReconciled;
        this.lineInterval = lineInterval;
    }
}

