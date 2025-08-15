package io.vflab.tms.controller

import io.vflab.tms.repository.TradeRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/trades")
class TradeController(private val tradeRepository: TradeRepository) {

}