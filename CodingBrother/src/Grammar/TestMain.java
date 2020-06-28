package Grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestMain {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();

		nums.add(Integer.valueOf(50));
		nums.add(Integer.valueOf(40));
		nums.add(Integer.valueOf(30));
		nums.add(Integer.valueOf(100));
		nums.add(Integer.valueOf(100));
		nums.add(Integer.valueOf(500));
		nums.add(Integer.valueOf(500));

		int sum = 0;
//		for (int i = 0; i < num.size(); i++) {
//			sum += num.get(i);
//		}
		for (Integer num : nums) {
			sum += num;
		}

		System.out.println((double) sum / nums.size());

		Map<String, Integer> map = ScoreService.getScores();
		Set<Entry<String, Integer>> set = map.entrySet();

		for (Entry<String, Integer> entry : set) {
			String name = entry.getKey();
			Integer score = entry.getValue();
			// Integer score = map.get(name);
			System.out.println("name : " + name + " | score : " + score);
		}
	}
	
	public static class ScoreService {
		
		/**
		 * 스코어 객체 가져오기 
		 * @return
		 */
		public static Map<String, Integer> getScores() {
			Map<String, Integer> map = new TreeMap<>();

			map.put("최성혁", 90);
			map.put("선현민", 95);
			map.put("최성혁2", 40);
			map.put("최성혁3", 50);
			map.put("최성혁4", 60);
			map.put("최성혁5", 70);
			map.put("최성혁6", 80);
			
			return map;
		}
		
	}

}
