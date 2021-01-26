package statisticker;

import java.util.List;

public class Statistics 
{
    static class Stats {

		public float average;
		public float min;
		public float max;
		
		public Stats(float avg, float min, float max) {
			this.average = avg;
			this.min = min;
			this.max = max;
		}
	
	}

	public static Stats getStatistics(List<Float> numbers) {
		
		Stats s = new Stats(findAverage(numbers), findMin(numbers), findMax(numbers));
		return s;
    }
	
	public static float findAverage(List<Float> numbers)
	 { 
		if(numbers.size() == 0 || numbers.isEmpty()) {
			return Float.NaN;
		}
			float sum = 0f;
			for (float number : numbers) 
				{ 
					sum = sum + number; 
				} 
			return sum / numbers.size();
	 }
	
	public static float findMax(List<Float> numbers) 
    { 
		if(numbers.size() == 0 || numbers.isEmpty()) {
			return Float.NaN;
		}
        int i; 
        float max = numbers.get(0);        
        for (i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);  
            }
        }
        return max; 
    }
	
	public static float findMin(List<Float> numbers) 
    { 
		if(numbers.size() == 0 || numbers.isEmpty()) {
			return Float.NaN;
		}
        int i;  
        float min = numbers.get(0);              
        for (i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);  
            }
        }
        return min; 
    }

}
