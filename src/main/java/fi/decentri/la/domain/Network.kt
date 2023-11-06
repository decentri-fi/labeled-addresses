package fi.decentri.la.domain

enum class Network(val slug: String, val logo: String, val baseUrl: String, val chainId: Int) {
    ETHEREUM("ethereum", "ethereum.png", "https://etherscan.io", 1),
    OPTIMISM("optimism", "optimism.png", "https://optimistic.etherscan.io", 10),
    ARBITRUM("arbitrum", "arbitrum.png", "https://arbiscan.io", 42161),
    POLYGON("polygon", "polygon.png", "https://polygonscan.com", 137),
    POLYGON_ZKEVM("polygon-zkevm", "polygon-zkevm.png", 1101),
    BASE("base", "base.png", 8453);
}