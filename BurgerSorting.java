public class BurgerSorting {
    public static void main(String[] args) {
        String[] burgerLayers = {"Tomato", "Cheese", "Lettuce", "Beef Patty", "Brioche Bun"};
        
        for (int i = 0; i < burgerLayers.length - 1; i++) {
            for (int j = 0; j < burgerLayers.length - i - 1; j++) {
                if (burgerLayers[j].compareTo(burgerLayers[j + 1]) > 0) {
                    String temp = burgerLayers[j];
                    burgerLayers[j] = burgerLayers[j + 1];
                    burgerLayers[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted Burger Layers: ");
        for (String layer : burgerLayers) {
            System.out.print(layer + " ");
        }
        // Output: Sorted Burger Layers: Beef patty Brioche bun Cheese Lettuce Tomato
    }
}
