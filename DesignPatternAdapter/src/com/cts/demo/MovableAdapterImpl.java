package com.cts.demo;
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;
    
    // standard constructors

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }
    
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }

	@Override
	public double getPrice() {
		
		return convertUSDtoEurpo(luxuryCars.getPrice());
	}

	private double convertUSDtoEurpo(double price) {
		// TODO Auto-generated method stub
		return price*0.84;
	}
    
    
}