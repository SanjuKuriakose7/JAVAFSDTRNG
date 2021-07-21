package com.ust;

enum WhoisRIR {
	ARIN("whois.arin.net"),
	RIPE("whois.ripe.net"),
	APNIC("whois.apnic.net"),
	AFRINIC("whois.afrinic.net"),
	LACNIC("whois.lacnic.net"),
	JPNIC("whois.nic.ad.jp"),
	KRNIC("whois.nic.or.kr"),
	CNNIC("ipWhois.cnnic.cn"),
	UNKNOWN(" ");
	private String url;
	WhoisRIR(String url) {
		this.url=url;
	}
	public String url() {
		return url;
	}
}
public class EnumExample6 {

	public static void main(String[] args) {
		WhoisRIR wh=WhoisRIR.AFRINIC;
		System.out.println(wh.url());
		
		WhoisRIR wh1=WhoisRIR.CNNIC;
		System.out.println(wh1.url());
		
		WhoisRIR wh2=WhoisRIR.JPNIC;
		System.out.println(wh2.url());
		

	}

}
