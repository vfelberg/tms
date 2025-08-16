package io.vflab.tms.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDate
import java.util.UUID

@Entity
@Table(name = "trade")
data class Trade(

    @Column
    val market: String, // e.g. gold, Bitcoin, DE, oil, TLT, Bund, TEM

    @Column
    @Enumerated(EnumType.STRING)
    val direction: TradeDirection,

    @Column(name = "start_date")
    val startDate: LocalDate,

    ) {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null

    @Column(name = "end_date")
    var endDate: LocalDate? = null
}