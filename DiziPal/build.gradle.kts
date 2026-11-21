version = 40

cloudstream {
    authors     = listOf("cxlstr")
    language    = "tr"
    description = "En yeni dizileri güvenli ve hızlı şekilde sunar."
    status  = 1
    tvTypes = listOf("TvSeries", "Movie")


// Bu kod cxlstr ve Patlak' ya aittir. İstediginiz gibi kullanabilirsiniz.
    val mainFile = project.file("src/main/kotlin/com/cxlstr/DiziPal.kt")
    val mainContent = mainFile.readText()
    val mainUrlRegex = """mainUrl\s*=\s*"https://([^"]+)"""".toRegex()
    
    val domain = mainUrlRegex.find(mainContent)?.groupValues?.get(1) 
        ?: throw GradleException("Domain DiziPal.kt dosyasından çekilemedi")
    
    iconUrl = "https://www.google.com/s2/favicons?domain=$domain&sz=32"
}
