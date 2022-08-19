package day35_custom_classes.carpet;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public Carpet (double inputWidth, double inpurLength, double inputUnitPrice, boolean inputIsPersian) {
        width = inputWidth;
        length = inpurLength;
        unitPrice = inputUnitPrice;
        isPersian = inputIsPersian;
        calculatePrice();

    }
public void  calculatePrice(){
        totalPrice = width * length * unitPrice;

        if (isPersian){
            totalPrice +=200;
        }
}

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
