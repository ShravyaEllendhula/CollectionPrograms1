package com.java.Set_I;

public class Fruits
{
	String fruitName;
	int quantity;
	double pricePerfruits;
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerfruits() {
		return pricePerfruits;
	}
	public void setPricePerfruits(double pricePerfruits) {
		this.pricePerfruits = pricePerfruits;
	}
	
	
	@Override
	public int hashCode() 
	{
		// return Objects.hash(fruitName,quantity,pricePerfruits);
		int hashcode = 0;
        hashcode += fruitName.hashCode();
        hashcode +=quantity*20.0;
        hashcode+=pricePerfruits*10.0;
        
        return hashcode;
	}
	@Override
	public boolean equals(Object obj) 
	{
		 
		if (obj instanceof Fruits) 
		{
			Fruits f1 = (Fruits) obj;
            return (f1.fruitName.equals(this.fruitName) && f1.quantity == this.quantity&&f1.pricePerfruits==this.pricePerfruits);
        } 
		else 
		{
            return false;
        }
		
	}
	@Override
	public String toString() 
	{
		return "Fruits [fruitName=" + fruitName + ", quantity=" + quantity + ", pricePerfruits=" + pricePerfruits + "]";
	}
	 
	
}
