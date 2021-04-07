package com.library.main;

public class enums {
    public enum AccountType{
        PATRON, LIBRARIAN, ADMIN
    }

    public enum FeeType{
        LATE, DAMAGE, MISC
    }

    public enum FeeStatus{
        UNPAID, PAID, FORGIVEN
    }

    public enum CheckoutStatus{
        DUE, OVERDUE, RETURNED
    }

    public enum Condition{
        WILLIAM, GOOD, FAIR, POOR, TRASHED
    }

    public enum BookStatus{
        AVAILABLE, CHECKED_OUT, RETURNED
    }
}
