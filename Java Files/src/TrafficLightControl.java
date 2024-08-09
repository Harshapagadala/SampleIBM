
public class TrafficLightControl {
  private TrafficLight currentlight;
  
  public TrafficLightControl(){
	  currentlight = TrafficLight.RED;
  }
  
  public void changeLight() {
	  switch (currentlight) {
	  case RED:
		  currentlight = TrafficLight.GREEN;
		  System.out.println("The light is now Green GO!!");
		  break;
	  case GREEN:
		  currentlight = TrafficLight.YELLOW;
		  System.out.println("The light is Yellow.. Go Slow!!");
		  break;
		  
	  case YELLOW:
		  currentlight = TrafficLight.RED;
		  System.out.println("The light is now Red. STOP!!");
		  break;
		  
  }
  }
  public static void main(String[] args) {
	TrafficLightControl trafficlightcontrol = new TrafficLightControl();
	trafficlightcontrol.changeLight();
	trafficlightcontrol.changeLight();
	trafficlightcontrol.changeLight();
}
}
  
