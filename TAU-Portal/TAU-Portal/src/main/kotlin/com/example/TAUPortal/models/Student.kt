data class Student: User (

    val studentNumber: String,
    val depermant: String,
    var semester: Int,
    val lectures: Lesson()

    );



