package jiraya.javacore.designpatterns.domain;

public interface Currency {
    String getSymbol();
}

class Real implements Currency{
    @Override
    public String getSymbol() {
        return "r$";
    }
}

class USDollar implements Currency{
    @Override
    public String getSymbol() {
        return "$";
    }
}
