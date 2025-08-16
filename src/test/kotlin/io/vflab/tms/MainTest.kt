package io.vflab.tms

import io.vflab.tms.model.InstrumentType.KNOCKOUT
import io.vflab.tms.model.Trade
import io.vflab.tms.model.TradeDirection
import io.vflab.tms.model.Transaction
import io.vflab.tms.model.TransactionType.BUY
import io.vflab.tms.model.TransactionType.SELL
import io.vflab.tms.repository.TradeRepository
import io.vflab.tms.repository.TransactionRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.Instant
import java.time.LocalDate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MainTest @Autowired constructor(
    val tradeRepository: TradeRepository,
    val transactionRepository: TransactionRepository,
) {

    @Test
    fun `Create and store trade and transaction`() {
        val trade = Trade("Bund", TradeDirection.SHORT, LocalDate.of(2025, 8, 15)).also { tradeRepository.save(it) }
        assertThat(trade.id).isNotNull

        val buy = Transaction(
            trade,
            transactionType = BUY,
            wkn = "PL8VD8",
            instrumentType = KNOCKOUT,
            executionTime = Instant.parse("2025-08-15T09:32:00Z"),
            amount = 20,
            priceInEuro = 61.21,
            transactionCostInEuro = 0.0
        ).also { transactionRepository.save(it) }
        assertThat(buy.id).isNotNull

        val sell = Transaction(
            trade,
            transactionType = SELL,
            wkn = buy.wkn,
            instrumentType = buy.instrumentType,
            executionTime = Instant.parse("2025-08-18T07:15:00Z"),
            amount = buy.amount,
            priceInEuro = 60.85,
            transactionCostInEuro = 0.0
        ).also { transactionRepository.save(it) }
        assertThat(sell.id).isNotNull

        assertThat(tradeRepository.findAll().map(Trade::id)).isEqualTo(listOf(trade.id))
        assertThat(transactionRepository.findAll().map(Transaction::id)).isEqualTo(listOf(buy.id, sell.id))
        assertThat(transactionRepository.findAllByTrade(trade).map(Transaction::id)).isEqualTo(listOf(buy.id, sell.id))
    }
}