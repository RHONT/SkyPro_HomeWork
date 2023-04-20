package Java_Core.Home_Work_2;

public enum Product {
    BANANAS(80), MILK(105 / 100f), ICE_CREAM(100), EGGS(70);
    private float weight;

    Product(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

}
