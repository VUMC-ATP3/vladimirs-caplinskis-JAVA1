package homeworkSix;

public class homworkVC {

    package hommework.oop_homework;
    public class DiscountRate {
        static private double serviceDiscountPremium = 0.2;
        static private double serviceDiscountGold = 0.15;
        static private double serviceDiscountSilver = 0.1;
        static private double productDiscountPremium = 0.1;
        static private double productDiscountGold = 0.1;
        static private double productDiscountSilver = 0.1;

        public static double getServiceDiscountRate(String type) {
            switch (type) {
                case "Premium":
                    return serviceDiscountPremium;
                case "Gold":
                    return serviceDiscountGold;
                case "Silver":
                    return serviceDiscountSilver;
                default:
                    throw new IllegalArgumentException("wrong service type specified");
            }
            public static double getProductDiscountRate(String type) {
                switch (type) {
                    case "Premium":
                        return productDiscountPremium;
                    case "Gold":
                        return productDiscountGold;
                    case "Silver":
                        return productDiscountSilver;
                    default:
                        throw new IllegalArgumentException("wrong service type specified");

                        package hommework.oop_homework;

import java.util.Date;

                        public class Example {

                            public static void main(String[] args) {

                                Customer customer=new Customer("Ruta");
                                customer.setMember(true);
                                customer.setMemberType("Gold");
                                Visit visit=new Visit(customer,new Date());
                                visit.setProductExpense(10.0);
                                visit.setServiceExpense(20.0);
                                System.out.println(visit);
                                System.out.println("Total expense made by " + visit.getName() + " = " + visit.getTotalExpense())

                                private Customer customer;
                                private Date date;
                                private double serviceExpense;
                                private double productExpense;
                                 public Visit(Customer customer, Date date) {
                                    this.customer = customer;
                                    this.date = date;
                                    public String getName() {
                                        return customer.getName();
                                    } public double getServiceExpense() {
                                        if (!customer.isMember()) {
                                            return serviceExpense;
                                        } else {
                                            return serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()));
                                        } public void setServiceExpense(double serviceExpense) {
                                            this.serviceExpense = this.serviceExpense + serviceExpense;
                                        }
                                        public double getProductExpense() {
                                            if (!customer.isMember()) {
                                                return productExpense;
                                            } else {
                                                return productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()));
                                            }
                                        }public void setProductExpense(double productExpense) {
                                            this.productExpense = this.productExpense = productExpense;
                                        }public double getTotalExpense() {
                                            return getProductExpense() + getServiceExpense();
                                        }
                                        @Override
                                        public String toString() {
                                            return "Visit{" +
                                                    "customer name=" + customer.getName() +
                                                    ", customer member=" + customer.isMember() +
                                                    ", customer member type=" + customer.getMemberType() +
                                                    ", date=" + date +
                                                    ", serviceExpense=" + serviceExpense +
                                                    ", productExpense=" + productExpense +
                                                    '}';
                                        }




                                    }






}
