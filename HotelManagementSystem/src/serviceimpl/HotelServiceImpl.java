package serviceimpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.HotelRepo;
import entity.Address;
import entity.Customer;
import service.HotelService;


public class HotelServiceImpl implements HotelService, HotelRepo {
	Scanner ip=new Scanner(System.in);
	{
		for (int i = 1; i <= 10; i++) 
		{
			cm.put(i, null);
		}
		for (int i = 1; i <= 8; i++) 
		{
			sm.put(i, null);
		}
		for (int i = 1; i <= 5; i++) 
		{
			dm.put(i, null);
		}
	}
	@Override
	public void roomInfo()
	{
		System.out.println("-------Classic Rooms------");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:No");
		System.out.println("Tv:No");
		System.out.println("Wifi:No");
		System.out.println("Price:2000 Rs");
		System.out.println("-------Standard Rooms------");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:No");
		System.out.println("Tv:Yes");
		System.out.println("Wifi:No");
		System.out.println("Price:2500 Rs");
		System.out.println("-------Delux Rooms------");
		System.out.println("Hot Water:Yes");
		System.out.println("AC:Yes");
		System.out.println("Tv:Yes");
		System.out.println("Wifi:Yes");
		System.out.println("Price:3500 Rs");
	}

	public void checkRoom(LinkedHashMap<Integer,Customer> l1) {
		boolean flag=false;
		for(Integer ele :l1.keySet())
		{
			if(l1.get(ele)==null)
			{
				System.out.println(ele+" ");
				flag=true;
			}
		}
		System.out.println();
		if(flag==false)
		{
			System.out.println("No Rooms Are Available");
		}
		
	}
	@Override
	public void availableRoom() {
		System.out.println("=====Available Rooms======");
		System.out.println("=====Classic Rooms");
		checkRoom(cm);
		System.out.println("=====Standard Rooms");
		checkRoom(sm);
		System.out.println("=====Delux Rooms");
		checkRoom(dm);
	}
	
	Customer createCustomer()
	{
		System.out.println("====Enter Customer Details=====");
		System.out.println("Enter Customer Id:-");
		int cid=ip.nextInt();
		System.out.println("Enter Customer Name:-");
		String cname=ip.next();
		System.out.println("Enter Customer Age:-");
		int cage=ip.nextInt();
		System.out.println("Enter Customer Phno:-");
		long cphno=ip.nextLong();
		System.out.println("Enter Customer Email:-");
		String cemail=ip.next();
		System.out.println("Enter Door No:-");
		String dn=ip.next();
		System.out.println("Enter Street Address:-");
		ip.nextLine();
		String street=ip.nextLine();
		System.out.println("Enter District:-");
		String dst=ip.next();
		System.out.println("Enter State:-");
		String state=ip.next();
		System.out.println("Enter the Pincode:-");
		int pincode=ip.nextInt();
		Address a =new Address(dn,street,dst,state,pincode);
		return new Customer(cid,cname,cage,cphno,cemail,cphno, a);
	}

	void mapRoom(LinkedHashMap<Integer,Customer> l1,int roomNo,double amt) 
	{
		if(l1.get(roomNo)==null)
		{
			Customer c=createCustomer();
			a1.add(c);
			l1.put(roomNo,c);
			c.setCamt(amt);
			System.out.println("Room No: " +roomNo+ "had been allocated for " +c.getCname());
			System.out.println("==========================");
		}
		else
		{
			System.out.println("Room is not available");
		}
	}
	@Override
	public void allocateRoom() {
		System.out.println("=======Menu=======");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Delux Room");
		int op=ip.nextInt();
		switch(op)
		{
			case 1:
			{
				System.out.println("Enter the Room No:");
				int roomNo1=ip.nextInt();
				if(roomNo1>=1&&roomNo1<=10)
				{
					mapRoom(cm,roomNo1,2000);
				}
				else 
				{
					System.out.println("Enter Correct Room No");
				}
				break;
			}
			case 2:
			{
				System.out.println("Enter the Room No:");
				int roomNo1=ip.nextInt();
				if(roomNo1>=1&&roomNo1<=8)
				{
					mapRoom(sm,roomNo1,2500);
				}
				else 
				{
					System.out.println("Enter Correct Room No");
				}
				break;
			}
			case 3:
			{
				System.out.println("Enter the Room No:");
				int roomNo1=ip.nextInt();
				if(roomNo1>=1&&roomNo1<=5)
				{
					mapRoom(dm,roomNo1,3500);
				}
				else 
				{
					System.out.println("Enter Correct Room No");
				}
				break;
			}
			default:
			{
				System.out.println("Invalid Option...");
			}
		}
	}
	
	void unMapRoom(LinkedHashMap<Integer,Customer> l1,int roomNo)
	{
		if(l1.get(roomNo)!=null)
		{
			Customer c1=l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+" need to pay " +c1.getCamt()+" Rs.");
			l1.compute(roomNo, null);
		}
		else
		{
			System.out.println("Invalid RoomNo... ");
		}
	}

	@Override
	public void checkOut() {
		System.out.println("======Menu=====");
		System.out.println("1.Classic Room\n2 Standard Room\n3.Delux Room");
		int op=ip.nextInt();
		System.out.println("Enter the Room No:-");
		int roomno=ip.nextInt();
		switch(op)
		{
			case 1:
			{
				if(roomno>=1&&roomno<=10)
				{
					unMapRoom(cm,roomno);
				}
				else
				{
					System.out.println("Invalid RoomNo...");
					break;
				}
			}
			case 2:
			{
				if(roomno>=1&&roomno<=8)
				{
					unMapRoom(sm,roomno);
				}
				else
				{
					System.out.println("Invalid RoomNo...");
					break;
				}
			}
			case 3:
			{
				if(roomno>=1&&roomno<=5)
				{
					unMapRoom(dm,roomno);
				}
				else
				{
					System.out.println("Invalid RoomNo...");
					break;
				}
			}
		}
		
	}

	@Override
	public void findAllCustomer()
	{
		if(a1.size()==0)
		{
			System.out.println("Database is empty......");
		}
		else
		{
			for(Customer ele:a1)
			{
				System.out.println(ele);
			}
		}
		
	}

	@Override
	public void getcustomerById()
	{
		boolean f=false;
		System.out.println("Enter the Customer id...");
		int cid=ip.nextInt();
		for(Customer ele:a1)
		{
			if(ele.getCid()==cid) 
			{
				System.out.println(ele);
				f=true;
				break;
			}
			if(f==false)
			{
				System.out.println("Invalid Customer Id....");
			}
		}
		
	}

	@Override
	public void exit() 
	{
		System.out.println("Exiting");
		for(int i=1;i<=8;i++)
		{
			try
			{
				Thread.sleep(450);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(".");
		}
		System.out.println("\n Thank You Visit Again...");
	}
}
