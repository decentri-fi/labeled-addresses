package fi.decentri.la

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LabeledAddressesApp

fun main(args: Array<String>) {
    runApplication<LabeledAddressesApp>(*args)
}