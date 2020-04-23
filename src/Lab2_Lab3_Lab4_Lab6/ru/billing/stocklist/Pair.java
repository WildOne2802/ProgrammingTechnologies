package Lab2_Lab3_Lab4_Lab6.ru.billing.stocklist;

class Pair<T, S> {
    public T firstValue;
    public S secondValue;


    Pair(T firstValue, S secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + firstValue.hashCode();
        result = prime * result + secondValue.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Pair newobj = (Pair) obj;

        return (this.firstValue.equals(newobj.firstValue)) && (this.secondValue.equals(newobj.secondValue));
    }
}
