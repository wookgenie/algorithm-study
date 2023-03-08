import java.time.LocalDate

class Solution {
    fun solution(a: Int, b: Int): String {
        var answer = ""
        val dayLisy = listOf("MON","TUE","WED","THU","FRI","SAT","SUN")
        
        val date = LocalDate.of(2016, a, b)
        val dayOfWeek = date.getDayOfWeek();
        val dayOfWeekNumber = dayOfWeek.getValue();
 
        answer = dayLisy.get(dayOfWeekNumber-1)
        
        return answer
    }
}