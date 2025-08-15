package io.vflab.tms.model

enum class InstrumentType {
    STOCK, // price in usd (non-null), price in euro (non-null)
        // + EURUSD exchange rate when buying on US exchange
    EUROPEAN_STOCK, // price in euro (non-null)
    OPTION, // price in euro (non-null), underlying price in usd (nullable: Bund, european stock), underlying price in eur (nullable: gold, Bitcoin)
        // + strike level, expiration date, spread
    KNOCKOUT, // same as option but with knockout level and expiration date nullable
    ETF, // price in usd (non-null), price in euro (non-null)
}