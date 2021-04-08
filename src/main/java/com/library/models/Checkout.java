package com.library.models;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

// This @Data annotation provided by lombok automatically generates
// the getters, setters, toString, and equals method for us at runtime
@Data
@Entity
public class Checkout {
    @Id
    @GeneratedValue
    private int id;
    // The transient keyword makes it so that Hibernate won't persist the now field
    // as a column in the database
    private final transient LocalDateTime now = LocalDateTime.now();
    private final Timestamp checkoutDate = Timestamp.valueOf(now);
    private Timestamp returnDueDate;

    public Checkout(){
        returnDueDate = Timestamp.valueOf(now.plusDays(14));
    }
}
