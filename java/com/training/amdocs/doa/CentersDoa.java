package com.training.amdocs.doa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.amdocs.entities.Centers;
@Component
public class CentersDoa 
{
	List<Centers> ct;
	public CentersDoa()
	{
		ct=new ArrayList<Centers>();
		
		ct.add(new Centers(1,"Pune",123));
		ct.add(new Centers(2,"mumbai",456));
		ct.add(new Centers(3,"nashik",789));


	}
	public List<Centers> GETALL()
	{
		return ct;
	}
	
	public Centers get(int pincode)
	{
		Centers object=null;
		
		for(Centers c:ct)
		{
			if(c.getPincode().equalsIgnoreCase(pincode))
			{
				object=c;
				break;
			}
			
		}
		return object;
	}
	
	public String Insert(int id,String name,int pincode)
	{
		Centers centers=new Centers(id,name,pincode);
		ct.add(centers);
		return "ADDED";
	}
}
