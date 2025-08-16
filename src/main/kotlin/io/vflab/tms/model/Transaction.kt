package io.vflab.tms.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "transaction")
class Transaction(

    @ManyToOne
    val trade: Trade,

    @Column(name = "transaction_type")
    @Enumerated(EnumType.STRING)
    val transactionType: TransactionType,

    val wkn: String,

    @Column(name = "instrument_type")
    @Enumerated(EnumType.STRING)
    val instrumentType: InstrumentType,

    @Column(name = "execution_time")
    val executionTime: Instant,

    val amount: Int,

    val priceInEuro: Double,

    val transactionCostInEuro: Double,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null
}