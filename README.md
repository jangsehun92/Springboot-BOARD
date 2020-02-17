# Springboot-BOARD
로그인 기능, 게시판 기능, 댓글 기능 등 게시판에 필요한 것들을 구현한다.
일반적으로 사용하게되는 게시판을 만드는 것을 목표로 한다.


환경

기능 목록
* 로그인
  * 관리자 로그인
  * 일반 로그인
  * 카카오 로그인
  
* 게시판
  * 보기
  * 쓰기
  * 수정
  * 삭제
  
* 댓글
  * 보기
  * 쓰기
  * 수정
  * 삭제
  
구현 목록
* 스프링 시큐리티를 이용하여 로그인 처리 및 권한 관리를 해준다.
* INDEX PAGE, LOGIN PAGE 두개만 사용한다.
* 게시글 및 댓글은 서버에 요청 하면 JSON 타입으로 리턴받아 AJAX 내에서 Javascript를 사용하여 표현한다.
