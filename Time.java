public class Time {
    private int secunds;
    public Time(){
       this.secunds=0;
    }
    public Time(int secunds){
        this.secunds=secunds;
    }
    public int getSecunds(){
        return secunds;
    }
    public void setSecunds(int secunds){
        if (secunds < 0) {
            throw new IllegalArgumentException("Секунды не могут быть отрицательными");
        }
        this.secunds=secunds;
    }
    @Override
    public String toString(){
        int secondsDay=secunds%(3600*24);
        int hours=secondsDay/3600;
        int minutes=(secondsDay%3600)/60;
        int seconds=secondsDay%60;
        return hours+":"+minutes+":"+seconds;
    }
}
