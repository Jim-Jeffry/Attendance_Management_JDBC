package uniq;
import java.util.Scanner;
public class CurrencyConverter {
public static  void step1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose which type of currency you want to convert");
	System.out.print("01.Eur    ");
	System.out.print("02.USD    ");
	System.out.println("03.AUD");
	System.out.print("04.GBP    ");
	System.out.print("05.XCD    ");
	System.out.println("06.XOF");
	System.out.print("07.NZD    ");
	System.out.print("08.NOK    ");
	System.out.println("09.XAF");
	System.out.print("10.ZAR    ");
	System.out.print("11.XPF    ");
	System.out.println("12.CLP");
	System.out.print("13.DKK    ");
	System.out.print("14.INR    ");
	System.out.println("15.RUB");
	System.out.print("16.TRY    ");
	System.out.print("17.DZD    ");
	System.out.println("18.MRU");
	System.out.print("19.MAD    ");
	System.out.print("20.ILS    ");
	System.out.println("21.JOD");
	System.out.print("22.BND    ");
	System.out.print("23.SGD    ");
	System.out.println("24.HKD");
	System.out.print("25.CHF    ");
	System.out.print("26.ANG    ");
	System.out.println("27.SHP");
	System.out.print("28.FKP    ");
	System.out.println("29.CAD");
	System.out.println("Select a Currency You want to Convert");
	int a=sc.nextInt();
		System.out.println("Choose which type of currency you want to be convert");
		System.out.print("01.Eur    ");
		System.out.print("02.USD    ");
		System.out.println("03.AUD");
		System.out.print("04.GBP    ");
		System.out.print("05.XCD    ");
		System.out.println("06.XOF");
		System.out.print("07.NZD    ");
		System.out.print("08.NOK    ");
		System.out.println("09.XAF");
		System.out.print("10.ZAR    ");
		System.out.print("11.XPF    ");
		System.out.println("12.CLP");
		System.out.print("13.DKK    ");
		System.out.print("14.INR    ");
		System.out.println("15.RUB");
		System.out.print("16.TRY    ");
		System.out.print("17.DZD    ");
		System.out.println("18.MRU");
		System.out.print("19.MAD    ");
		System.out.print("20.ILS    ");
		System.out.println("21.JOD");
		System.out.print("22.BND    ");
		System.out.print("23.SGD    ");
		System.out.println("24.HKD");
		System.out.print("25.CHF    ");
		System.out.print("26.ANG    ");
		System.out.println("27.SHP");
		System.out.print("28.FKP    ");
		System.out.println("29.CAD");
		System.out.println("Select a Currency You want to be Convert");
		int b=sc.nextInt();
		
		if (a==1&&b==1) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+c+" EUR");
		}
		else if (a==1&&b==2) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*1.12)+" USD");
		}
		else if (a==1&&b==3) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*1.64)+" AUD");
		}
		else if (a==1&&b==4) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*0.84)+" GBP");
		}
		else if (a==1&&b==5) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*3.01)+" XCD");
		}
		else if (a==1&&b==6) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*652.77)+" XOF");
		}
		else if (a==1&&b==7) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*1.78)+" NZD");
		}
		else if (a==1&&b==8) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*11.71)+" NOK");
		}
		else if (a==1&&b==9) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*652.80)+" XAF");
		}
		else if (a==1&&b==10) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*19.77)+" ZAR");
		}
		else if (a==1&&b==11) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*119.38)+" XPF");
		}
		else if (a==1&&b==12) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*1009.99)+" CLP");
		}
		else if (a==1&&b==13) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*7.46)+" DKK");
		}
		else if (a==1&&b==14) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*93.40)+" INR");
		}
		else if (a==1&&b==15) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*101.64)+" RUB");
		}
		else if (a==1&&b==16) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*37.86)+" TRY");
		}
		else if (a==1&&b==17) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*148.76)+" DZD");
		}
		else if (a==1&&b==18) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*44.02)+" MRU");
		}
		else if (a==1&&b==19) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*10.75)+" MAD");
		}
		else if (a==1&&b==20) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*4.07)+" ILS");
		}
		else if (a==1&&b==21) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*0.79)+" JOD");
		}
		else if (a==1&&b==22) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*1.45)+" BND");
		}
		else if (a==1&&b==23) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*1.45)+" SGD");
		}
		else if (a==1&&b==24) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*8.68)+" HKD");
		}
		else if (a==1&&b==25) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*0.94)+" CHF");
		}
		else if (a==1&&b==26) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*2.00)+" ANG");
		}
		else if (a==1&&b==27) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*0.84912)+" SHP");
		}
		else if (a==1&&b==28) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*0.846764)+" FKP");
		}
		else if (a==1&&b==29) {
			System.out.println("Enter the value of Eur Currency");
			float c=sc.nextFloat();
			System.out.println(c+" EUR = "+(c*1.50)+" CAD");
		}
		else if (a==2&&b==1) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*0.90)+" EUR");
		}
		else if (a==2&&b==2) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c)+" USD");
		}
		else if (a==2&&b==3) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*1.47)+" AUD");
		}
		else if (a==2&&b==4) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*0.76)+" GBP");
		}
		else if (a==2&&b==5) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*2.70)+" XCD");
		}
		else if (a==2&&b==6) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*589.27)+" XOF");
		}
		else if (a==2&&b==7) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*1.59)+" NZD");
		}
		else if (a==2&&b==8) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*10.49)+" NOK");
		}
		else if (a==2&&b==9) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*589.28)+" XAF");
		}
		else if (a==2&&b==10) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*17.82)+" ZAR");
		}
		else if (a==2&&b==11) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*107.14)+" XPF");
		}
		else if (a==2&&b==12) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*914.00)+" CLP");
		}
		else if (a==2&&b==13) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*6.70)+" DKK");
		}
		else if (a==2&&b==14) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*83.93)+" INR");
		}
		else if (a==2&&b==15) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*91.50)+" RUB");
		}
		else if (a==2&&b==16) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*34.16)+" TRY");
		}
		else if (a==2&&b==17) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*133.81)+" DZD");
		}
		else if (a==2&&b==18) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*46.17)+" MRU");
		}
		else if (a==2&&b==19) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*9.65)+" MAD");
		}
		else if (a==2&&b==20) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*3.65)+" ILS");
		}
		else if (a==2&&b==21) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*0.71)+" JOD");
		}
		else if (a==2&&b==22) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*1.30)+" BND");
		}
		else if (a==2&&b==23) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*1.30)+" SGD");
		}
		else if (a==2&&b==24) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*7.80)+" HKD");
		}
		else if (a==2&&b==25) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*0.84)+" CHF");
		}
		else if (a==2&&b==26) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*1.80)+" ANG");
		}
		else if (a==2&&b==27) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*0.757186 )+" SHP");
		}
		else if (a==2&&b==28) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c* 0.757335)+" FKP");
		}
		else if (a==2&&b==29) {
			System.out.println("Enter the value of USD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" USD = "+(c*1.35)+" CAD");
		}
		else if (a==3&&b==1) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.61)+" EURO");
		}
		else if (a==3&&b==2) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.68)+" USD");
		}
		else if (a==3&&b==3) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c)+" AUD");
		}
		else if (a==3&&b==4) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.52)+" GBP");
		}
		else if (a==3&&b==5) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*1.84)+" XCD");
		}
		else if (a==3&&b==6) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*402.10)+" XOF");
		}
		else if (a==3&&b==7) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*1.08)+" NZD");
		}
		else if (a==3&&b==8) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*7.14)+" NOK");
		}
		else if (a==3&&b==9) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*402.10)+" XAF");
		}
		else if (a==3&&b==10) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*12.07)+" ZAR");
		}
		else if (a==3&&b==11) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*73.46)+" XPF");
		}
		else if (a==3&&b==12) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*621.63)+" CLP");
		}
		else if (a==3&&b==13) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*4.58)+" DKK");
		}
		else if (a==3&&b==14) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*56.97)+" INR");
		}
		else if (a==3&&b==15) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*62.16)+" RUB");
		}
		else if (a==3&&b==16) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*23.16)+" TRY");
		}
		else if (a==3&&b==17) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*91.00)+" DZD");
		}
		else if (a==3&&b==18) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*31.37)+" MRU");
		}
		else if (a==3&&b==19) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*6.60)+" MAD");
		}
		else if (a==3&&b==20) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*2.49)+" ILS");
		}
		else if (a==3&&b==21) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.48)+" JOD");
		}
		else if (a==3&&b==22) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.88)+" BND");
		}
		else if (a==3&&b==23) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.89)+" SGD");
		}
		else if (a==3&&b==24) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*5.30)+" HKD");
		}
		else if (a==3&&b==25) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.58)+" CHF");
		}
		else if (a==3&&b==26) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*1.23)+" ANG");
		}
		else if (a==3&&b==27) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.5184)+" SHP");
		}
		else if (a==3&&b==28) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.5199)+" FKP");
		}
		else if (a==3&&b==29) {
			System.out.println("Enter the value of AUD Currency");
			float c=sc.nextFloat();
			System.out.println(c+" AUD = "+(c*0.92)+" CAD");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		else if (a==4&&b==1) {
			System.out.println("Enter the value of GBP Currency");
			float c=sc.nextFloat();
			System.out.println(c+" GBP = "+(c*1.19)+" EURO");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		step1();
	}
}
