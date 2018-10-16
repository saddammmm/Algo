import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Alltriplet {

	public static void main(String[]argd) throws IOException{
		
		
		String loginURL="https://netbanking.hdfcbank.com/netbanking/entry?fldpwdtmp=&fldAppId=RS&fldDevicePrint=&fldTxnId=RGN&fldScrnSeqNbr=01&fldLangId=eng&fldDeviceId=01&fldWebServerId=YG&fldAppServerId=ZZ&fldRandomNumber=&fldRefPage=rsloginhtml&fldRefVal=USERID--NETBANKING--&fldLoginUserId=USERID";
		
		loginURL=loginURL.replaceAll("USERID", "60991273");
		System.out.println(loginURL);
		
	}
	}

