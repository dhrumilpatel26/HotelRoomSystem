package app;

import java.util.Scanner;

import service.HotelService;
import serviceimpl.HotelServiceImpl;

public class HotelApp {
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		HotelService h1=new HotelServiceImpl();
		System.out.println("-------Welcome To Hotel Management System-------");
		while(true)
		{
			System.out.println("-----Menu-----");
			System.out.println("1.Room Details\n2.Room Available");
			System.out.println("3.Allocate Room\n4.checkOut\n5.findAllCustomer\n6.getCustomerById\n7.Exit");
			System.out.println("Enter your option:");
			int op=ip.nextInt();
			switch(op)
			{
			case 1:
				{
					h1.roomInfo();
					break;
				}
			case 2:
				{
					h1.availableRoom();
					break;
				}
			case 3:
				{
					h1.allocateRoom();
					break;
				}
			case 4:
				{
					h1.checkOut();
					break;
				}
			case 5:
				{
					h1.findAllCustomer();
					break;
				}
			case 6:
				{
					h1.getcustomerById();
					break;
				}
			case 7:
				{
					System.out.println("Thank You Visit Again");
					System.exit(0);
				}
			}
		}
	}
}
