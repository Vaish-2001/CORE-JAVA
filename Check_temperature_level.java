/*Q. 1]	Write a program in java to take temperature input and display suitable message according to range of temperature
		if temperature is
		
			0-15	----------	Very cold
			15-25	----------	Cold
			25-30	----------	Medium
			30-40	----------	Very hot
			40-50	----------	Extreme
	
*/

class Check_temperature_level
  {
    public static void main(String[]args)
      {
       double temp = 21.5;
       String result = temp>=0 && temp<10?"very cold"
                      :temp>=10 && temp<20?"cold"
                      :temp>=20 && temp<30?"moderate"
                      :temp>=30 && temp<40?"summer"
                      :temp>=40 && temp<50?"very hot"
                      :(" out of range ");

       System.out.println(result);  
      }
  }

/*output:CT:SUCESS
         RT:Moderate
*/