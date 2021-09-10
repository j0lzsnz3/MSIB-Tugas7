/**
 * Class RegistrationForm dengan parameter:
 * name, birthDay, email, phonrNumber, address.
 * Juga memilki function mencetak hasil registration form.
 */
data class RegistrationForm (
    val name: String,
    val birthDay: String,
    val email: String,
    val phoneNumber: String,
    val address: String
) {
    fun printRegistrationForm() {
        println("*****************************")
        println("--------DATA MAHASISWA-------")
        println("Nama : $name")
        println("Tanggal Lahir : $birthDay")
        println("Email : $email")
        println("Nomor Handphone : $phoneNumber")
        println("Alamat: $address")
        println("*****************************")
    }
}