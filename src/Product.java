class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        if(price < 0){
            this.price = 0;
            System.out.println("Цена не может быть отрицательной. Установлено значение 0.");
        }
        else{
            this.price = price;;
        }
    }

    public String getName(){
        return name;
   }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;

        if(price < 0){
            System.out.println("Цена не может быть отрицательной");
        }
        else{
            System.out.println("Цена " + " " + price);
        }
    }
}
