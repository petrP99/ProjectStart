package com.pers;

import com.pers.entity.Admin;
import com.pers.entity.Card;
import com.pers.entity.Client;
import com.pers.entity.Role;
import com.pers.entity.Status;
import com.pers.entity.Transfer;
import com.pers.entity.User;
import com.pers.util.HibernateUtil;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.pers.util.ExpireDateUtil.*;
import static com.pers.util.GenerateNumberCardUtil.*;
import static com.pers.util.HibernateUtil.startSession;

@Slf4j
public class HibernateRunner {

    public static void main(String[] args) throws SQLException {

        User user1 = User.builder()
                .login("user3@gmail.com")
                .password("123")
                .role(Role.USER)
                .build();

        User user2 = User.builder()
                .login("user2@gmail.com")
                .password("123")
                .role(Role.USER)
                .build();

        User user3 = User.builder()
                .login("user3@gmail.com")
                .password("123")
                .role(Role.USER)
                .build();

        Admin admin = Admin.builder()
                .login("admin1")
                .password("123")
                .role(Role.ADMIN)
                .build();

        Client client1 = Client.builder()
                .userId(1l)
                .balance(BigDecimal.valueOf(1000))
                .firstName("Ivan")
                .lastName("Ivanov")
                .status(Status.ACTIVE)
                .createdDate(LocalDate.now())
                .build();

        Client client2 = Client.builder()
                .userId(2l)
                .balance(BigDecimal.valueOf(5000))
                .firstName("Petr")
                .lastName("Petrov")
                .status(Status.ACTIVE)
                .createdDate(LocalDate.now())
                .build();

        Card card1 = Card.builder()
                .clientId(1l)
                .cardNo(generateNumber())
                .cardBalance(BigDecimal.valueOf(1000))
                .createdDate(LocalDate.now())
                .expireDate(calculateExpireDate())
                .status(Status.ACTIVE)
                .build();

        Card card2 = Card.builder()
                .clientId(2l)
                .cardNo(generateNumber())
                .cardBalance(BigDecimal.valueOf(1000))
                .createdDate(LocalDate.now())
                .expireDate(calculateExpireDate())
                .status(Status.ACTIVE)
                .build();

        Transfer transfer = Transfer.builder()
                .cardNoFrom(5432L)
                .cardNoTo(5433L)
                .transferAmount(BigDecimal.valueOf(188))
                .dataAndTime(Timestamp.valueOf(LocalDateTime.now()))
                .status(Status.SUCCESS)
                .build();

        startSession(user1);
        startSession(admin);
        startSession(user2);
        startSession(client1);
        startSession(user3);
        startSession(client2);
        startSession(card1);
        startSession(card2);
        startSession(transfer);

    }


}

