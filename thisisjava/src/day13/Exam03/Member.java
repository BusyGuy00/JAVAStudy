package day13.Exam03;

import lombok.Data;

//@Getter// @어너테이션 ?
//@Setter
//@NoArgsConstructor // 없는 생성자
//@AllArgsConstructor // 매개 변수 다 받는 생성자
//@EqualsAndHashCode 
//@ToString
@Data //생성자, Getter, Setter, EqualsAndHashCode, ToString을 다 포함 하고 있어서 전부 설정 하는것과 같다 
public class Member {
	private String id;
	private String name;
	private int age;
}
