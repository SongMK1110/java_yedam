package homework_0125;
import java.util.List;
public class Lotto {

		// List 활용한 Lotto
		// 1. 중복되지 않은 번호 6개
		// 2. 입력한 금액에 따라 한장당 1~5줄 생성
		// 3. 한 줄당 천원, 입력한 금액 만큼 생성
		// 4. 구매 금액, 생성된 번호 출력 기능
		// 5. 5장씩 끊어서 출력 할 것.


	
	//클래스로 사용할 경우
	private List<int[]> lottoNo;
	private String name;



	public List<int[]> getLottoNo() {
		return lottoNo;
	}

	public void setLottoNo(List<int[]> lottoNo) {
		if(this.lottoNo == null) {
			this.lottoNo = lottoNo;			
		} else {
			this.lottoNo.add(lottoNo.get(0));
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

