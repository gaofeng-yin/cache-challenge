# Cache

### Problem Description

After each Bolina connection, both client and server store some relevant information to improve the performance and efficiency of future connections. That information is stored in a object that we called Cache, which is unique for each pair Client/Server.

Since each server can have several hundreds of clients, we had to limit the number of Cache objects in memory, while ensuring that the time it takes to access an available Cache would not had any impact on the connection time.

How would you implement the Class that stores the cache objects?

### Requirements

* Each Cache has a timestamp of the moment it was created;
* The number of Caches available in memory must be limited. When full, adding a new one will delete the oldest Cache, based on the creation timestamp;
* Each Cache can store any type of information (String, Long, ...);
* Instant access to every available Cache.


### Bonus Points

* Allow the update of the Cache's data. The oldest Cache in memory will be defined based on the update timestamp.


### Input/Output Example

    size = 3
    Cache cache(size)

    cache.add("1")
        > ok
    cache.print()
        > "1"
      
    cache.add("2")
        > ok
    cache.print()
        > "1","2"

    cache.add("3")
        > ok
    cache.print()
        > "1","2","3"

    cache.add("4")
        > ok
    cache.print()
        > "2","3","4"

