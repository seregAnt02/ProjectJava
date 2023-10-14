
package OOP.task_6;


/**
 * Ордер заказов.
 */
public class Order {
         
    private String clientName;
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private String product;
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }

    private int qnt;
    public int getQnt() {
        return qnt;
    }
    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    private double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
