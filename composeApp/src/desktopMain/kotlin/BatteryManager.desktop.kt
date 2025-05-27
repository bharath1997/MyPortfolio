import oshi.SystemInfo
import kotlin.math.roundToInt

/**
 * @author bharathvenkatesan
 * Created 10/07/24 at 1:12 PM
 */
actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        val systemInfo = SystemInfo()
        val batterylevel = systemInfo.hardware.powerSources.firstOrNull()
        return batterylevel?.remainingCapacityPercent?.times(100)?.roundToInt() ?: -1
    }
}