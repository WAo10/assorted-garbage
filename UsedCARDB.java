import java.util.ArrayList;
public class UsedCARDB implements UsedCarListing{
	private ArrayList<UsedCarListing> carList; //contains used car listings in order of price
	private ArrayList<UsedCarListing> newCarList;
	public void addCarListing(UsedCarListing car)
	{
		boolean pass = true;
		for (int i = 0; i<carList.size(); i++) 
		{
			
			if ((carList.get(i).price() > car.price()) && pass == true)
			{ 
				carList.add(car);
				pass = false;
			}
		}
	
	}

	public UsedCarListing cheapest(String type, String condition)
	{
		UsedCarListing cheapest = null;
		for (int i = 0; i<carList.size(); i++)
		{
			
			if (((carList.get(i).condition() == condition) && (carList.get(i).carType() == type) || (type=="any" && carList.get(i).condition() == condition) || (condition == "any" && carList.get(i).carType() == type))){
				cheapest = carList.get(i);
			}
		}
		return cheapest;
	}
	
	public ArrayList<UsedCarListing> choices(double low, double high, String type, String condition)
	{
		for (int i = 0; i<carList.size(); i++)
		{
			if (carList.get(i).price()>=low && carList.get(i).price()<=high && carList.get(i).carType() == type && carList.get(i).condition() == condition)
			{
				newCarList.add(carList.get(i));
			}
		}
		return newCarList;
	}

	public String carType()
	{
		return "hah";
	}
	
	public String condition()
	{
		return "heh";
	}
	
	public double price()
	{
		return 0.01;
	}
}

