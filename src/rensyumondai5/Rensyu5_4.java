package rensyumondai5;

public class Rensyu5_4 {
	
	public static double calcTriangleArea(double bottom, double height)
	{
		return bottom * height /2;
	}
	
	public static double calcCirclArea(double radius)
	{
		return radius * radius* 3.14;
	}
	public static void main(String[] args) 
	{
		System.out.println("長さ" + calcTriangleArea(10.0, 2.0) + "cm,高さ" + calcTriangleArea(2.0, 5.0) + "cmの三角形の面積は" + calcTriangleArea(10.0, 5.0) + "㎠です");
		System.out.println("円の面積は" + calcCirclArea(5.0) + "㎠です");
		
	}

}
