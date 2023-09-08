package day18.Book.Exam09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap <>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		//set으로 변환 
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		for(Map.Entry<String,Integer> entry:  entrySet ) {
			//최대값 구하기 entry값이 최대값보다 크면 entry값을 최대값에 할당 
			if(entry.getValue()>maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
			
		}
		System.out.println("평균 점수 : " + (totalScore/map.size()));
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
			 
	}
}
