module my_module_a {
	//모듈이 가지고 있는 패키지를 외부에서 사용 할 수 있도록 함 
	exports pack1;
//	exports pack2;
	// 주석 처리 하거나 exports 되지 않은 패키지는 자동으로 은닉(쓸수 없게)된다
	requires transitive my_module_b;
//	transitive 다른 프로젝트나 클래스에 모듈 전이를 하는 명령어 
}