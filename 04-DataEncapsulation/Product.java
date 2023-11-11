public class Product {
    private String name;
    private boolean is_vege;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isIs_vege() {
        return is_vege;
    }
    public void setIs_vege(boolean is_vege) {
        this.is_vege = is_vege;
    }
    public String toString(){  
        return "Product : " + name + " Is vege " + is_vege;
}
}
