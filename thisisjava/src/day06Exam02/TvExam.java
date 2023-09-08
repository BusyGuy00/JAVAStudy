package day06Exam02;

public class TvExam {
//			Tv클래스
//			속성 브랜드 필드 브랜드 변경 / 전원 false /채널 0 /음량 10 /
//			동작 
//			전원 on powerOn "전원이 켜집니다." 출력 전원 필드 true
//			전원 off powerOff "전원이 꺼집니다." 출력 필드 false
//			채널이동
//			channelUp()		채널 필드 값을 1증가 채널 출력
//			channelDown()	채널 필드 값을 1감소 채널 출력
//			음량 조절 
//			volumeUp() 		음량 필드값을 1증가 음량출력
//			volumeDown() 	음량 필드값을 1감소 음량출력
			
		public String company1 = "LG전자";
		public String company2 = "삼성전자";
		int channel;
		
		void powerOn () {
			System.out.println("전원을 켭니다.");
		}
		void powerOff () {
			System.out.println("전원을 끕니다.");
		}
		void channelUp() {
			this.channel++;
			System.out.println("채널을 올립니다."+ this.channel );
		}
		void channelDown() {
			this.channel--;
			System.out.println("채널을 내립니다."+ this.channel );
		}
			
			
			
}			 

