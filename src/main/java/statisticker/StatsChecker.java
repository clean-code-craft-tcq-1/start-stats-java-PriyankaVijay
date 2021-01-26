package statisticker;

import java.util.Arrays;
import java.util.List;

public class StatsChecker {

	float maxThreshold;
	 IAlerter[] alerters;
	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(Float[] numbers) {
		List<Float> numberList = Arrays.asList(numbers);
		if (Statistics.findMax(numberList) > this.maxThreshold) {
			for(IAlerter alerter : alerters) {
				alerter.alert(true);
			}
		} else {
			for(IAlerter alerter : alerters) {
				alerter.alert(false);
			}
		}
		
	}

}
