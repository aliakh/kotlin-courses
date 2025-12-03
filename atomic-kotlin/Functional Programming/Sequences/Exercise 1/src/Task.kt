// Sequences/Task1.kt
package sequencesExercise1

fun School.commonLessons(
  instructor: Instructor,
  student: Student
): Sequence<Lesson> =
  lessons.filter { instructor == it.instructor && student in it.students }