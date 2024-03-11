package com.khjin.tdd_practice.week2.lotto

class GameNumberMatcher {
    fun matchOneGame(winningNumbers: List<Int>, game: List<Int>): Int{
        var result = 0
        for(num in game)
            if (winningNumbers.contains(num))
                result++

        return result
    }

    fun matchBonusNumber(bonusNumber: Int, game: List<Int>): Boolean {
        return game.contains(bonusNumber)
    }

}