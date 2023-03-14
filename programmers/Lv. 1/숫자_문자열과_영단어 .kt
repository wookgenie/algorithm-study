fun solution(s: String): Int {
    var answer: Int = 0

    val num = arrayOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    val eng =  arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

    var result = s
    for(i in 0..9) {
        result = result.replace(eng[i], num[i])
        println(result)
    }

    answer = result.toInt()

    return answer
}