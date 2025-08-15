package io.vflab.tms.repository

import io.vflab.tms.model.Trade
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TradeRepository : JpaRepository<Trade, String> {

}