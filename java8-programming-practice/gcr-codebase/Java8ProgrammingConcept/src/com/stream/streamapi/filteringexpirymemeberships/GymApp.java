package com.stream.streamapi.filteringexpirymemeberships;

import java.time.LocalDate;
import java.util.List;

public class GymApp {

    public static void main(String[] args) {

        List<Member> members = List.of(
                new Member("Saurav", LocalDate.now().plusDays(5)),
                new Member("Rahul", LocalDate.now().plusDays(40)),
                new Member("Anita", LocalDate.now().plusDays(45)),
                new Member("Vikas", LocalDate.now().minusDays(2)),
                new Member("Neha", LocalDate.now().plusDays(28))
        );

       List<Member> expiredList =  members.stream().filter(m -> m.getExpiryDate().isAfter(LocalDate.now().plusDays(30))).toList();
       
       expiredList.forEach(m -> System.out.println(m));

    }
}

