fun isStrongPassword(password: String): Boolean {
    if (password.length < 8) {
        return false
    }

    var isUpperCase = false
    var isNumber = false
    for(char in password) {
        if(char.isUpperCase()) {
            isUpperCase = true
        }
        if(char.isDigit()) {
            isNumber = true
        }
    }
    if(isNumber && isUpperCase) {
        return true
    }
    else {
        return false
    }
}

fun main() {
    val password = readln()
    println("Password is strong: ${isStrongPassword(password)}")
}

main()