data class Lesson (
    val lesson_id : UUID,
    val name : String,
    var classroom : Classroom,
    var date : Date,
    var prof : String,
    var assistants : String,
    val link : String

)