package com.tamerb.intro;

public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(){
        //business rules
        customerDal.add();
    }
}
