fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
    var answer: String = ""

    var cardNum1 = 0
    var cardNum2 = 0

    var checkGoal = true

    for (i in goal) {
        if (checkGoal) {
            var card1: String
            var card2: String

            if (cards1.size != cardNum1) {
                card1 = cards1[cardNum1]
                if (i == card1) {
                    cardNum1++
                } else {
                    if (cards2.size != cardNum2) {
                        card2 = cards2[cardNum2]
                        if (i == card2) {
                            cardNum2++
                        } else {
                            checkGoal = false
                        }
                    } else {
                        checkGoal = false
                    }
                }
            } else {
                if (cards2.size != cardNum2) {
                    card2 = cards2[cardNum2]
                    if (i == card2) {
                        cardNum2++
                    } else {
                        checkGoal = false
                    }
                } else {
                    checkGoal = false
                }
            }
        }
    }

    return if (checkGoal) "Yes" else "No"
}