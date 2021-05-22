package algorithmic_toolbox.week1

data class Dollar(var amount: Int) {
    fun times(ratio: Int): Dollar {
        return Dollar(amount * ratio);
    }

    override fun equals(other: Any?): Boolean {
        other as Dollar
        return (amount == other.amount)
    }

}