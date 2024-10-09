package tat.mukhutdinov.lesson20.data

import android.graphics.Color
import androidx.annotation.StringRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import tat.mukhutdinov.lesson20.R

@Entity
data class Juice(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val description: String = "",
    val color: String,
    val rating: Int
)

enum class JuiceColor(val color: Int, @StringRes val label: Int) {
    Red(Color.RED, R.string.red),
    Blue(Color.BLUE, R.string.blue),
    Green(Color.GREEN, R.string.green),
    Cyan(Color.CYAN, R.string.cyan),
    Yellow(Color.YELLOW, R.string.yellow),
    Magenta(Color.MAGENTA, R.string.magenta)
}
