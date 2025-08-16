package io.vflab.tms.repository

import io.vflab.tms.model.Trade
import io.vflab.tms.model.Transaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransactionRepository : JpaRepository<Transaction, String> {
    fun findAllByTrade(trade: Trade): List<Transaction>
}