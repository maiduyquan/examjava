public class Flight {
    private int number;
    private String destination;

    public Flight(){
        number=446;
        destination="tonado";
    }
    public Flight(int num,String des){
        number=num;
        destination=des;
    }
    public void displayFlight(){
        System.out.println("number:"+number);
        System.out.println("destination:" +destination);
    }
    public int getNumber(){
        return number;
    }

    public String getDestination() {
        return destination;
    }
}
