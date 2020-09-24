# design_patterns
<h1>Java Clean Code Tutorial #3 - Builder Design Pattern Example</h1>

https://www.youtube.com/watch?v=xy6FUwftz1Q

* 24.09.2020. - Added guava.jar into root
-> 23.09.2020. - Added Guava jar to buildpath
* 23.09.2020. - Complete code as seen on youtube.

"Benefits of the java builder pattern:
 - No need to pass Null objects into the constructor.
 - You don�t need to guess or try to work out which constructor parameter maps to a certain object�s field. Error prone!
 - Easily made into an Immutable class. You can now share the object safely between threads or in a multi-threaded environment as you don�t need to worry about mutation of variable state. 
 - Provides control over object construction steps and provides meaningful semantic method names.
 - Increases the use-ability, maintainability and readability of code when creating objects.

Software is written once and read hundreds of times. So let�s make our fellow developers life easier.
"

"He just explained the builder pattern of Joshua Bloch from Effective Java"

"The main purpose was to explain the core concepts of the design pattern. I�m sure you already know but you can use the extremely popular java library Lombok to generate this boilerplate code - 1 annotation, @Builder is all you need. But I�m quite surprised you don�t see any real value in this common pattern, most engineers do. And a large range of great libraries use builders heavily such as gRPC and all the newer spring config etc. Maybe it�s worth a second look , hope this helps"