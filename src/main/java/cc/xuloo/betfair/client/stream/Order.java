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

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;


/**
 * Order
 */
@Value
public class Order   {
  /**
   * Side - the side of the order. For Line markets a 'B' bet refers to a SELL line and an 'L' bet refers to a BUY line.
   */
  public enum Side {

    B("B"),

    L("L");

    private String value;

    Side(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  /**
   * Persistence Type - whether the order will persist at in play or not (L = LAPSE, P = PERSIST, MOC = Market On Close)
   */
  public enum PersistenceType {

    L("L"),

    P("P"),

    MOC("MOC");

    private String value;

    PersistenceType(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  /**
   * Order Type - the type of the order (L = LIMIT, MOC = MARKET_ON_CLOSE, LOC = LIMIT_ON_CLOSE)
   */
  public enum OrderType {

    L("L"),

    LOC("LOC"),

    MOC("MOC");

    private String value;

    OrderType(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  /**
   * Status - the status of the order (E = EXECUTABLE, EC = EXECUTION_COMPLETE)
   */
  public enum Status {

    E("E"),

    EC("EC");

    private String value;

    Status(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  /**
   * Side - the side of the order. For Line markets a 'B' bet refers to a SELL line and an 'L' bet refers to a BUY line.
   * @return side
   **/
  private final Side side;

  /**
   * Size Voided - the amount of the order that has been voided
   * @return sv
   **/
  private final Double sv;

  /**
   * Persistence Type - whether the order will persist at in play or not (L = LAPSE, P = PERSIST, MOC = Market On Close)
   * @return pt
   **/
  private final PersistenceType pt;

  /**
   * Order Type - the type of the order (L = LIMIT, MOC = MARKET_ON_CLOSE, LOC = LIMIT_ON_CLOSE)
   * @return ot
   **/
  private final OrderType ot;

  /**
   * Price - the original placed price of the order. Line markets operate at even-money odds of 2.0. However, price for these markets refers to the line positions available as defined by the markets min-max range and interval steps
   * @return p
   **/
  private final Double p;

  /**
   * Size Cancelled - the amount of the order that has been cancelled
   * @return sc
   **/
  private final Double sc;

  /**
   * Regulator Code - the regulator of the order
   * @return rc
   **/
  private final String rc;

  /**
   * Size - the original placed size of the order
   * @return s
   **/
  private final Double s;

  /**
   * Placed Date - the date the order was placed
   * @return pd
   **/
  private final Long pd;

  /**
   * Regulator Auth Code - the auth code returned by the regulator
   * @return rac
   **/
  private final String rac;

  /**
   * Matched Date - the date the order was matched (null if the order is not matched)
   * @return md
   **/
  private final Long md;

  /**
   * Lapsed Date - the date the order was lapsed (null if the order is not lapsed)
   * @return ld
   **/
  private final Long ld;

  /**
   * Size Lapsed - the amount of the order that has been lapsed
   * @return sl
   **/
  private final Double sl;

  /**
   * Average Price Matched - the average price the order was matched at (null if the order is not matched). This value is not meaningful for activity on Line markets and is not guaranteed to be returned or maintained for these markets.
   * @return avp
   **/
  private final Double avp;

  /**
   * Size Matched - the amount of the order that has been matched
   * @return sm
   **/
  private final Double sm;

  /**
   * Order Reference - the customer's order reference for this order (empty string if one was not set)
   * @return rfo
   **/
  private final String rfo;

  /**
   * Bet Id - the id of the order
   * @return id
   **/
  private final String id;

  /**
   * BSP Liability - the BSP liability of the order (null if the order is not a BSP order)
   * @return bsp
   **/
  private final Double bsp;

  /**
   * Strategy Reference - the customer's strategy reference for this order (empty string if one was not set)
   * @return rfs
   **/
  private final String rfs;

  /**
   * Status - the status of the order (E = EXECUTABLE, EC = EXECUTION_COMPLETE)
   * @return status
   **/
  private final Status status;

  /**
   * Size Remaining - the amount of the order that is remaining unmatched
   * @return sr
   **/
  private final Double sr;

    public Order(@JsonProperty("side") Side side,
                 @JsonProperty("sv") Double sv,
                 @JsonProperty("pt") PersistenceType pt,
                 @JsonProperty("ot") OrderType ot,
                 @JsonProperty("p") Double p,
                 @JsonProperty("sc") Double sc,
                 @JsonProperty("rc") String rc,
                 @JsonProperty("s") Double s,
                 @JsonProperty("pd") Long pd,
                 @JsonProperty("rac") String rac,
                 @JsonProperty("md") Long md,
                 @JsonProperty("ld") Long ld,
                 @JsonProperty("sl") Double sl,
                 @JsonProperty("avp") Double avp,
                 @JsonProperty("sm") Double sm,
                 @JsonProperty("rfo") String rfo,
                 @JsonProperty("id") String id,
                 @JsonProperty("bsp") Double bsp,
                 @JsonProperty("rfs") String rfs,
                 @JsonProperty("status") Status status,
                 @JsonProperty("sr") Double sr) {
        this.side = side;
        this.sv = sv;
        this.pt = pt;
        this.ot = ot;
        this.p = p;
        this.sc = sc;
        this.rc = rc;
        this.s = s;
        this.pd = pd;
        this.rac = rac;
        this.md = md;
        this.ld = ld;
        this.sl = sl;
        this.avp = avp;
        this.sm = sm;
        this.rfo = rfo;
        this.id = id;
        this.bsp = bsp;
        this.rfs = rfs;
        this.status = status;
        this.sr = sr;
    }
}

