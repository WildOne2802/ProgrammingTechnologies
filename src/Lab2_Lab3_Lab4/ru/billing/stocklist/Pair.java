package Lab2_Lab3_Lab4.ru.billing.stocklist;

class Pair<T, S> {
    public T firstValue;
    public S secondValue;


    Pair(T firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public boolean equals(Object obj) {
        Pair newobj = (Pair) obj;

        return (this.firstValue.equals(newobj.firstValue)) && (this.secondValue.equals(newobj.secondValue));
    }
}
