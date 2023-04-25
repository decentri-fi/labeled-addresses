package fi.decentri.la.domain

import jakarta.persistence.*


@Entity
@Table(name = "name_tags")
class NameTag(
    @Id
    val address: String,
    val tag: String,
    @Column(name = "chain")
    @Enumerated(EnumType.STRING)
    val network: Network
)