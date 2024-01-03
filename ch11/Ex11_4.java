package ch11;

import java.util.*;

public class Ex11_4 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // 큐에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) { //무한 반복
			System.out.print(">>");
			try {
				
				Scanner s = new Scanner(System.in); //스캐너로 입력 받음
				String input = s.nextLine().trim(); //trim: "  Hello World  "
													//문자열 양 옆에 공백이 있으면
													//앞 뒤 공백 삭제해 줌. 가운데 공백은 처리하지 않음.
			
			if("".equals(input)) continue;//만약. 입력 값이 비어있으면 continue 실행.
									      //아래부분 무시하고 다시 위로 돌아감.
			
			if(input.equalsIgnoreCase("q")) { //q를 입력하면 종료
											  //equalsIgnoreCase: 대소문자 구분 x
				System.exit(0); //프로그램 종료
				
			}else if( input.equalsIgnoreCase("help")) { //help 입력하면 도움말 보여줌.
				System.out.println("help - 도움말을 보여줍니다.");
				System.out.println("q 또는 Q- 프로그램을 종료합니다.");
				System.out.println("history - 최근에 입력한 명령어를" + MAX_SIZE+ "개 보여줍니다.");
			}else if(input.equalsIgnoreCase("history")) { //만약 history를 입력값으로 주면
				int i=0; //입력받은 명령어를 i에 저장하고
				save(input); //save 메소드 실행. 
				
				LinkedList tmp = (LinkedList)q; // 큐는 메소드가 별로 없음
												// 그렇기 때문에 LinkedList로 형변환.
				ListIterator it = tmp.listIterator(); //ListInterator?
				
				while(it.hasNext())
					System.out.println(++i+"."+it.next());
			}else {
				save(input);
				System.out.println(input);
			}
			}catch(Exception e) {
				System.out.println("입력 오류입니다.");
			}
			}
			
		}
		
		public static void save(String input) { //save 메소드는 큐 입력한 명령어를 저장.
			if(!"".equals(input)) //만약 빈문자열이 아니라면
				q.offer(input); //q에 명령어를 저장.
								//offer()저장. poll()삭제
							
			//queue의 최대 크기를 넘으면 제일 처음 입력된 값을 삭제.
			if(q.size() > MAX_SIZE) //size()는 Collection인터페이스에 정의되어 있음.
				q.remove();// remove 되어있는데, poll();써도 같음.
		}
	}


