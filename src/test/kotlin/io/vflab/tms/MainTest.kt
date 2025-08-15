package io.vflab.tms

import io.vflab.tms.repository.TradeRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MainTest @Autowired constructor(val tradeRepository: TradeRepository) {

    @Test
    fun contextLoads() {
    }
}