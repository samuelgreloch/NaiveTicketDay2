/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine {
    // The price of a ticket from this machine.
    private Integer price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;
    // The number of tickets printed.
    private Integer ticketNumber;

    private Integer refund;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(Integer ticketCost) {
        price = ticketCost;
        balance = 0;
        total = 20;
        ticketNumber = 0;
        refund = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * Return ticketNumber.
     * (Increments on each print.)
     */
    public Integer getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public Integer insertMoney(Integer amount) {
        balance = balance + amount;
        return balance;
    }

    public Integer calculateTotal() {
        total = balance + total;
        return total;
    }

    public Integer incrementTicketNumber() {
        ticketNumber++;
        return ticketNumber;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public String printTicket() {
        // Increment the number of tickets printed
        incrementTicketNumber();
        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
       balance = 0;

        return "Ticket price: " + price + " cents. " + "Your total is " + total + ".";
    }
        public Integer getRefund() {
            balance = getBalance();
            refund = balance - price;
            return refund;


    }


    //public static void main(String[] args) {
    //TicketMachine myticket1 = new TicketMachine(100);
    //      {
    // myticket1.balance(100);
    // myticket1.price(50);
    //myticket1.ticketNumber(1);
    //myticket1.total(1);


    //     }
    // }

    //private Integer gettotal(int i) {
    //     return total;
    // }

    // private Integer getticketNumber(int i) {
    //     return ticketNumber;

    //  }

    //private Integer price(int i) {
    //     return price;
    //  }

    //private Integer balance(int i) {
    //      return balance;
    // }

   // public static void main(String[] args) {

       // TicketMachine machine1 = new TicketMachine(20);
       // System.out.println("price of each Ticket: " + machine1.getPrice());
      //  System.out.println("amount of money Inserted: " + machine1.insertMoney(50));
      //  System.out.println("Balance present: " + machine1.getBalance());

       // System.out.println(machine1.printTicket());
       // System.out.println(machine1.getTicketNumber());
       // System.out.println(machine1.getRefund());
       // System.out.println("balance present: " + machine1.getBalance());
   // }
//}
public static void main(String[] args) {

    TicketMachine machine1 = new TicketMachine(20);
    System.out.println("Your ticket number:" + machine1.getTicketNumber());
    System.out.println("Your total is:" + machine1.total);
    System.out.println("price of each Ticket: " + machine1.getPrice());
    //System.out.println(machine1.total = machine1.total + machine1.balance);
    System.out.println("amount of money Inserted: " + machine1.insertMoney(50));
    System.out.println("balance present: " + machine1.getRefund());
    if (machine1.insertMoney(0) < machine1.price)
        System.out.println("You are broke");

   // System.out.println("Balance present: " + machine1.getBalance());


    //System.out.println(machine1.printTicket());
    //System.out.println(machine1.getTicketNumber());
    //System.out.println(machine1.getRefund());


    //System.out.println( machine1.printTicket());
     //System.out.println(machine1.getincrementTicketNumber());


      // machine1.balance = 0;
}
}
