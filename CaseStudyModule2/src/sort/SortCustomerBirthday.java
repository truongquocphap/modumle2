package sort;

import module.Customer;

import java.util.Comparator;

public class SortCustomerBirthday implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
