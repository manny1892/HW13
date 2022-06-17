package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManager {
    Ticket first = new Ticket(1, 15000, "LED", "GOJ", 240);
<<<<<<< HEAD
    Ticket second = new Ticket(2, 15000, "LED", "GOJ", 330);
=======
    Ticket second = new Ticket(2, 11000, "LED", "GOJ", 330);
>>>>>>> 30b5ef9ab2104dbbca755cc152d02d94c04ad35a
    Ticket third = new Ticket(3, 4300, "GOJ", "LED", 453);
    Ticket fourth = new Ticket(4, 15000, "EGO", "LED", 210);
    Ticket fifth = new Ticket(5, 12000, "EGO", "LED", 140);
    Ticket sixth = new Ticket(6, 15000, "EGO", "LED", 1240);

    @Test
    public void shouldViewAllAddTickets() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        manager.getAll();

        Ticket[] actual = manager.getAll();
        Ticket[] expected = {first, second, third, fourth, fifth, sixth};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldDeleteIdTicket() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        manager.removeById(3);

        Ticket[] actual = manager.getAll();
        Ticket[] expected = {first, second, fourth, fifth, sixth};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldViewSelectAirportsTickets() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

<<<<<<< HEAD
        Ticket[] actual = manager.findAll("EGO", "LED",new TicketByTravelTimeAscComparator());
=======
        Ticket[] actual = manager.findAll("EGO", "LED");
>>>>>>> 30b5ef9ab2104dbbca755cc152d02d94c04ad35a
        Ticket[] expected = {fifth, fourth, sixth};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldViewSelectThreeAirportsTicketsAndSort() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

<<<<<<< HEAD
        Ticket[] actual = manager.findAll("LED", "GOJ", new TicketByTravelTimeAscComparator());
        Ticket[] expected = {first, second};
=======
        Ticket[] actual = manager.findAll("LED", "GOJ");
        Ticket[] expected = {second, first};
>>>>>>> 30b5ef9ab2104dbbca755cc152d02d94c04ad35a

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNotViewAirportsBecauseFalseDepartureNotEqualFalseArrival() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        manager.getAll();

<<<<<<< HEAD
        Ticket[] actual = manager.findAll("AAA", "AAA", new TicketByTravelTimeAscComparator());
=======
        Ticket[] actual = manager.findAll("AAA", "AAA");
>>>>>>> 30b5ef9ab2104dbbca755cc152d02d94c04ad35a
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotViewAirportsBecauseTrueDepartureNotEqualFalseArrival() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        manager.getAll();

<<<<<<< HEAD
        Ticket[] actual = manager.findAll("LED", "AAA", new TicketByTravelTimeAscComparator());
=======
        Ticket[] actual = manager.findAll("LED", "AAA");
>>>>>>> 30b5ef9ab2104dbbca755cc152d02d94c04ad35a
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotViewAirportsBecauseFalseDepartureNotEqualTrueArrival() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        manager.getAll();

<<<<<<< HEAD
        Ticket[] actual = manager.findAll("AAA", "GOJ", new TicketByTravelTimeAscComparator());
=======
        Ticket[] actual = manager.findAll("AAA", "GOJ");
>>>>>>> 30b5ef9ab2104dbbca755cc152d02d94c04ad35a
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
}

