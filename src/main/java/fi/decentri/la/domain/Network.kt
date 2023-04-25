package fi.decentri.la.domain

enum class Network(val slug: String, val logo: String, val baseUrl: String, val chainId: Int) {
    ETHEREUM("ethereum", "ethereum.png", "https://etherscan.io", 1),
    OPTIMISM("optimism", "optimism.png", "https://optimistic.etherscan.io", 10),
    ARBITRUM("arbitrum", "arbitrum.png", "https://arbiscan.io", 42161),
    FANTOM("fantom", "fantom.png", "https://ftmscan.com", 250),
    AVALANCHE("avalanche", "avalanche.png", "https://cchain.explorer.avax.network", 43114),
    BINANCE("binance", "bsc.svg", "https://bscscan.com", 56),
    POLYGON("polygon", "polygon.png", "https://polygonscan.com", 137),
    STARKET("starknet.png", "starknet", "https://starknet.io", 0),
}