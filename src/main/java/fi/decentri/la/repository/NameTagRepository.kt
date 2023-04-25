package fi.decentri.la.repository

import fi.decentri.la.domain.NameTag
import org.springframework.data.jpa.repository.JpaRepository

interface NameTagRepository : JpaRepository<NameTag, String> {
}