public class Gun {
    private int cartridges;
    public Gun(){
        this.cartridges=5;
    }
    public Gun(int cartridges){
        this.cartridges=cartridges;
    }
    public String toString(){
        if (getCartridges() > 0){
            setCartridges(getCartridges() - 1);
            return "Бах!";
        } else{
            return "Клац!";
        }
    }
    public int getCartridges(){
        return cartridges;
    }
    public void setCartridges(int cartridges){
        if (cartridges < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        }
        this.cartridges=cartridges;
    }



}
