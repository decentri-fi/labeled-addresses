package fi.decentri.la.domain

import jakarta.persistence.*


@Entity
@Table(name = "name_tags")
class NameTag(
    @EmbeddedId
    val nameTagId: String,
    val tag: String,
)

@Embeddable
class NameTagId(
    val address: String,
    @Column(name = "chain")
    @Enumerated(EnumType.STRING)
    val network: Network
)
