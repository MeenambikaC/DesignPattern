# This is a folder of Singleton

1. It is a creational design pattern
2. Singleton pattern ensures only 1 instance of class is created in JAVA VM
3. Singleton pattern is used for logging, drivers objects, caching, and thread pool.
4. Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade, etc.

-> Singleton can be loaded both as eager loading or lazy loading (better - Avoids unnescerry instance creation)
-> To make it thread safe global access method is made synchronized so that only one thread can execute this method at a time
-> Thread safe is costly so double-checked locking principle is used


Reference : https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples

