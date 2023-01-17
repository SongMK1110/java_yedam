package homework_0117;

public class PortableNotebook implements Notebook, Tablet {

	private int mode;
	private String document;
	private String browser;
	private String video;
	private String app;

	public PortableNotebook(String document, String browser, String video, String app) {
		mode = NOTEBOOK_MODE;
		this.document = document;
		this.browser = browser;
		this.video = video;
		this.app = app;
		System.out.println("NOTEBOOK_MODE");
	}

	@Override
	public void watchVideo() {
		System.out.println(video + "를 시청.");
	}

	@Override
	public void useApp() {
		changeMode();
		System.out.println(app + "을 실행.");

	}

	@Override
	public void writeDocumentaion() {
		System.out.println(document + "을 통해 문서를 작성.");
	}

	@Override
	public void searchInternet() {
		System.out.println(browser + "을 통해 인터넷을 검색.");
	}

	public void changeMode() {
		if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
			System.out.println("TABLET_MODE");
		} else if (mode == TABLET_MODE) {
			mode = NOTEBOOK_MODE;
			System.out.println("NOTEBOOK_MODE");
		}
	}

}
