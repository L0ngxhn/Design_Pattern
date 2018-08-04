package machine;

import bean.Cookie;
import bean.CountCookie;

public class CookieMachine {
	private Cookie cookie;

	public CookieMachine(Cookie cookie) {
		this.cookie = cookie;
	}

	public Cookie makeCookie() {
		try {
			return (Cookie) cookie.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Cookie tempCookie = null;
		Cookie prot = new CountCookie();
		CookieMachine cm = new CookieMachine(prot); // ����ԭ��
		for (int i = 0; i < 100; i++)
			tempCookie = cm.makeCookie();// ͨ������ԭ�ͷ��ض��cookie
	}
}
