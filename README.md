# Data Structures

Java implementations from a Data Structures course. Covers the core structures you actually need to know: linked lists, stacks, queues, trees, and hash tables, plus a semester-long final project that tied everything together.

## Contents

`src/` has all the individual structure implementations and exercises. The final project is a traffic ticket management system that models drivers, vehicles, violations, and tickets using multiple data structures working together. It's the most complete piece in the repo.

`final project/` classes:
- `TrafficTicket`, `TrafficTicketManagement` -- core domain model
- `Driver`, `Vehicle`, `Violation` -- entity classes
- `FileOperations`, `AuxiliaryOperations`, `MenuOperations` -- utility and I/O layers
- `Driver.java` -- main entry point

A few other notable files in `src/`:
- `CTA_RedLine.java`, `CTA_BrownLine.java`, `CTA_GreenLine.java` -- linked-list models of Chicago L train lines
- `HammockHotel.java`, `LargeHouse.java`, `ResidentialCarGarage.java` -- inheritance and OOP hierarchy exercises
- `DynamicBookArray.java` -- dynamic resizing array implementation
- `SimpleXIFO.java`, `XIFO.java` -- custom FIFO/LIFO hybrid structure

## Stack

Java
