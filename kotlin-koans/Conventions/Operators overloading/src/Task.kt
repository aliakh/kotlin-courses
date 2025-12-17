import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

class MultipliedTimeInterval(val timeInterval: TimeInterval, val amount: Int)

operator fun MyDate.plus(timeInterval: TimeInterval) =
    addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervals: MultipliedTimeInterval) =
    addTimeIntervals(timeIntervals.timeInterval, timeIntervals.amount)

operator fun TimeInterval.times(amount: Int) =
    MultipliedTimeInterval(this, amount)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
