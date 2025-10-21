public class House {
    private int floors;
    private boolean floorsSet=false;

    public House(int floors){
        setFloors(floors);
    }
    public int getFloors(){
        return floors;
    }
    public void setFloors(int floors){
        if(floorsSet){
            System.out.println("Количество этажей изменить нельзя!");
            return;
        }
        this.floors=floors;
        this.floorsSet=true;
    }

    @Override
    public String toString(){
        int floorInHouse=getFloors();
        if(floorInHouse%10==1){
            return "дом с " + floorInHouse+" этажом";
        }
        else{
            return "дом с "+floorInHouse+" этажами";
        }
    }
}
