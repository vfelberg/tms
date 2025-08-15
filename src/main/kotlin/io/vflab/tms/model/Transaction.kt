package io.vflab.tms.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "transaction")
class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private var id: String? = null

}