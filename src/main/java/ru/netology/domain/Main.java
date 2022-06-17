package ru.netology.domain;

public class Main {
    public static void main(String[] args) {

        Ticket first = new Ticket(1, 5000, "LED", "GOJ", 240);
<<<<<<< HEAD
        Ticket second = new Ticket(2, 5000, "LED", "GOJ", 330);
        Ticket third = new Ticket(3, 5000, "LED", "GOJ", 453);
        Ticket fourth = new Ticket(4, 5000, "LED", "GOJ", 210);
=======
        Ticket second = new Ticket(2, 110, "LED", "GOJ", 330);
        Ticket third = new Ticket(3, 4300, "GOJ", "LED", 453);
        Ticket fourth = new Ticket(4, 7000, "KUF", "LED", 210);
>>>>>>> 30b5ef9ab2104dbbca755cc152d02d94c04ad35a
        Ticket fifth = new Ticket(5, 12000, "OGZ", "EGO", 140);
        Ticket sixth = new Ticket(6, 15000, "EGO", "LED", 1240);

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        manager.removeById(6);

        manager.getAll();

<<<<<<< HEAD
        manager.findAll("LED", "GOJ",new TicketByTravelTimeAscComparator());
=======
        manager.findAll("KUF", "LED");
>>>>>>> 30b5ef9ab2104dbbca755cc152d02d94c04ad35a
    }
}
