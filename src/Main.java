public class Main{
    public static void main(String[] args){
        Product product = new Product("Ноутбук", 50000.0);
        System.out.println("Исходный продукт: " + product.getName() + ", Цена: " + product.getPrice());

        // 1. Демонстрация успешной установки цены
        System.out.println("\n--- Попытка установить корректную цену (60000.0) ---");
        product.setPrice(60000.0);
        System.out.println("Текущая цена: " + product.getPrice());

        // 2. Демонстрация попытки установить отрицательную цену
        System.out.println("\n--- Попытка установить отрицательную цену (-100.0) ---");
        product.setPrice(-100.0);
        System.out.println("Текущая цена (осталась прежней): " + product.getPrice());

    }
}