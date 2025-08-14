package collectionEx.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addQuantity) {
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + addQuantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }

    public void minus (Product product, int minusQuantity) {
        int existingQuntity = cartMap.getOrDefault(product, 0);
        int newQuntity = existingQuntity - minusQuantity;
        if (newQuntity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuntity);
        }
    }
    // 코드 작성
}

