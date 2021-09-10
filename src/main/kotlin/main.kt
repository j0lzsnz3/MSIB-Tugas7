fun main(args: Array<String>) {
    // Membuat Object dashboard dari class Dashboard
    val dashboard = Dashboard()

    val name = "John Udin"
    val birthDay = "15 July 1995"
    val email = "john.udin14@hotmail.com"
    val phoneNumber = "08776635536"
    val address = "Jalan salatiga, Kalimantan Barat"

    dashboard.register(name, birthDay, email, phoneNumber, address)
    dashboard.printLatestRegistrationForm()
}