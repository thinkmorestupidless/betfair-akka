# betfair-akka

A Java client for the [Betfair](https://www.betfair.com/) Exchange API, built on Akka actors. Covers both:

- **Exchange API** (`client/exchange`) - the REST/JSON-RPC "API-NG" surface: listing events, markets, and market books, placing and managing orders, and the full set of request/response entities and enums Betfair defines for it.
- **Stream API** (`client/stream`) - the WebSocket-based push feed for live market and order changes (`MarketChangeMessage`, `OrderChangeMessage`), including authentication, heartbeats, and subscription messages.

Built to plug into other projects (such as [less-stupid-betting](https://github.com/thinkmorestupidless/less-stupid-betting)) as the real market-data and order-execution layer, replacing simulated/random exchange data with a live Betfair connection. Used for real trading.

Set up to publish to Sonatype as a standalone library (see `build.sbt`), under the `cc.xuloo` namespace.

## Structure

- `BetfairClientActor` - top-level actor that owns a session and coordinates the exchange and stream actors.
- `BetfairExchangeActor` / `ExchangeApi` - exchange (REST) operations.
- `BetfairStreamActor` / `StreamProtocol` - stream (WebSocket) connection and message handling.
- `BetfairSession`, `BetfairCredentials`, `BetfairSettings` - authentication and configuration.

## Building

```bash
sbt compile
```

## License

Apache-2.0.
