package verify.exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*HashMap에 아이디(String)와 점수(Integer)가 저장되어 있습니다. 실행 결과와 같이 평균 점수를 출력하고
최대 점수와 최대 점수를 얻은 아이디를 출력해 보세요
출력결과 : 
평균 점수 : 91
최고 점수 : 96
최고 점수를 받은 이름 : blue
*/
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("red", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		// 작성 위치
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > maxScore) {
				name = entry.getKey(); // 최고 점수 이름 저장됨.
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore / map.size();
		System.out.println("평균 점수 : " + avgScore);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 이름 : " + name);
	}
}