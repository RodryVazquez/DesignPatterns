package com.example.rodrigovazquez.designpatterns.BuilderPattern;

/**
 * Creacion de un objeto usando el builder pattern
 */

public class LaunchOrderTele {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private LaunchOrderTele(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.Meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public static class Builder{

        private String bread;
        private String condiments;
        private String dressing;
        private String Meat;

        //Ningun campo requerido
        public Builder(){}

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder setDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder setMeat(String meat) {
            Meat = meat;
            return this;
        }

        public LaunchOrderTele Build(){
            return new LaunchOrderTele(this);
        }
    }
}
