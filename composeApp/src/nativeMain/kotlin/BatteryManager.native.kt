import platform.UIKit.UIDevice
import kotlin.math.roundToInt

/**
 * @author bharathvenkatesan
 * Created 10/07/24 at 1:12 PM
 */
actual class BatteryManager {
    actual fun getBatteryLevel(): Int {
        UIDevice.currentDevice.batteryMonitoringEnabled = true
        val batteryLevel = UIDevice.currentDevice.batteryLevel
        return (batteryLevel * 100).roundToInt()
    }
}