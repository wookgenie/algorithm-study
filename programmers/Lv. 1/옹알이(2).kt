fun solution(babbling: Array<String>): Int {
    var answer: Int = 0
    val canPron = listOf("aya", "ye", "woo", "ma")

    for (i in babbling) {
        var checkRepeat = true
        for (j in canPron) {
            checkRepeat = !i.contains(j + j)
            if (!checkRepeat) break
        }

        var cnt = true
        if (checkRepeat) {
            val split = i.split("aya", "ye", "woo", "ma")
            split.forEach {
                if (it.length > 0) cnt = false
            }
            if (cnt) answer++
        }
    }
    return answer
}