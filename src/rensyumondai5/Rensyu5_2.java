package rensyumondai5;

public class Rensyu5_2 {

	public static void email(String title, String address, String text)
	{
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
		
	}
	
	public static void  email(String address, String text)
	{
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題" );
		System.out.println("本文：" + text);
		
	}
	
	public static void main(String[] args) 
	{
		email("こんにちは", "adad@gmail.jp", "こんにちは");
		email("ad@gmail", "こんばんわ");
		
	}
}
