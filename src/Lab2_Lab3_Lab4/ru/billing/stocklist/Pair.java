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
        if (this == obj) return true;
        if (obj == null || getClass() == obj.getClass()) return false;

        Pair newobj = (Pair) obj;

        if (firstValue != null ? !firstValue.equals(newobj.firstValue) : newobj.firstValue != null) return false;
        if (secondValue != null ? !secondValue.equals(newobj.secondValue) : newobj.secondValue != null)return false;

        return true;
        //        return (this.firstValue.equals(newobj.firstValue)) && (this.secondValue.equals(newobj.secondValue));
    }
}
