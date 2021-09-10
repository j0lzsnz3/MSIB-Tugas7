/**
 * Class Dashboard digunakan untuk melakukan aktivitas,
 * salah satunya aktivitas mendaftar melalui func register()
 */
class Dashboard {
    // Property pada Class Dashboard.
    private var registrationForm: RegistrationForm? = null
    private var latestRegisteredName: String = ""

    // func untuk melakukan registrasi
    fun register(
        name: String,
        birthDay: String,
        email: String,
        phoneNumber: String,
        address: String
    ) {
        // assign property registration dengan Object baru.
        registrationForm = RegistrationForm(name, birthDay, email, phoneNumber, address)

        val studentName = registrationForm!!.name
        if (latestRegisteredName == studentName) {
            println("Nama ini sudah terdaftar di sistem.")
        } else {
            println(registrationForm!!.printRegistrationForm())
        }
    }

    // func untuk mencetak form registrasi terakhir yang dibuat.
    fun printLatestRegistrationForm() {
        if (registrationForm != null) {
            registrationForm!!.printRegistrationForm()
        } else {
            println("Belum ada registrasi form yang telah dibuat.")
        }
    }

}