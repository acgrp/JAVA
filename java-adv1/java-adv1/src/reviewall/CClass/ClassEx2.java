package reviewall.CClass;

public class ClassEx2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        ProductOrder[] productOrders = new ProductOrder[]{productOrder1, productOrder2, productOrder3};

        for (int i = 0; i < productOrders.length; i++) {
            System.out.println("상품명: " + productOrders[i].productName + ", 가격" + productOrders[i].price + ", 수량" + productOrders[i].quantity);
        }
        System.out.println("총 경제 금액: " + ((productOrders[0].price*productOrders[0].quantity)+(productOrders[1].price*productOrders[1].quantity)+(productOrders[2].price*productOrders[2].quantity)));
    }
}
